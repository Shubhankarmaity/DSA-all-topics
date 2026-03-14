import json
import os

class Rule:
    def __init__(self, antecedents, consequent):
        self.antecedents = antecedents 
        self.consequent = consequent    # conclusion
        self.fired = False

    def __repr__(self):
        return f"{' & '.join(self.antecedents)} -> {self.consequent}"

    def to_dict(self):
        return {"antecedents": self.antecedents, "consequent": self.consequent}

    @staticmethod
    def from_dict(data):
        return Rule(data["antecedents"], data["consequent"])


class KnowledgeBase:
    def __init__(self):
        self.rules = []
        self.facts = set()

    def add_fact(self, fact):
        self.facts.add(fact)

    def add_rule(self, rule):
        self.rules.append(rule)

    def reset_rules(self):
        for r in self.rules:
            r.fired = False

    def show(self):
        print("\n=== Knowledge Base ===")
        print("Facts:")
        for f in sorted(self.facts):
            print(" -", f)
        print("\nRules:")
        for r in self.rules:
            print(" -", r)
        print("======================")

    def save(self, filename="knowledge.json"):
        data = {
            "facts": list(self.facts),
            "rules": [r.to_dict() for r in self.rules],
        }
        with open(filename, "w") as f:
            json.dump(data, f, indent=4)
        print(f" Knowledge base saved to '{filename}'")

    def load(self, filename="knowledge.json"):
        if not os.path.exists(filename):
            print(f"No file named '{filename}' found.")
            return
        with open(filename, "r") as f:
            data = json.load(f)
        self.facts = set(data.get("facts", []))
        self.rules = [Rule.from_dict(r) for r in data.get("rules", [])]
        print(f" Knowledge base loaded from '{filename}'")


class ForwardChaining:
    def __init__(self, kb):
        self.kb = kb

    def infer(self):
        print("\n Starting Forward Chaining...")
        new_fact_added = True
        self.kb.reset_rules()

        while new_fact_added:
            new_fact_added = False
            for rule in self.kb.rules:
                if not rule.fired and all(a in self.kb.facts for a in rule.antecedents):
                    if rule.consequent not in self.kb.facts:
                        print(f" Rule Fired: {rule}")
                        self.kb.add_fact(rule.consequent)
                        new_fact_added = True
                    rule.fired = True

        print("\n Inference complete. Final Facts:")
        for fact in sorted(self.kb.facts):
            print(" -", fact)
        print("=============================")
    def __init__(self, kb):
        self.kb = kb

    def query(self, goal):
        print(f"\n Querying goal: {goal}")
        visited = []
        result = self._infer(goal, visited)
        print("=============================")
        return result

    def _infer(self, goal, visited):
        if goal in self.kb.facts:
            print(f" {goal} is known.")
            return True

        if goal in visited:
            return False
        visited.append(goal)

        applicable_rules = [r for r in self.kb.rules if r.consequent == goal]
        if not applicable_rules:
            print(f" No rule produces {goal}.")
            return False

        for rule in applicable_rules:
            print(f"Trying rule: {rule}")
            success = True
            for ant in rule.antecedents:
                if not self._infer(ant, visited[:]):
                    success = False
                    break
            if success:
                print(f" Inferred {goal} via {rule}")
                self.kb.add_fact(goal)
                return True

        print(f" Cannot infer {goal}")
        return False


def print_menu():
    print("\n========== AI INFERENCE SHELL ==========")
    print("1. View Knowledge Base")
    print("2. Add Fact")
    print("3. Add Rule")
    print("4. Forward Chaining")
    print("5. Backward Chaining (Query)")
    print("6. Save Knowledge Base")
    print("7. Load Knowledge Base")
    print("8. Exit")
    print("========================================")


def build_default_kb():
    kb = KnowledgeBase()
    # Example default knowledge base
    kb.add_rule(Rule(["human"], "mortal"))
    kb.add_rule(Rule(["has_feathers"], "bird"))
    kb.add_rule(Rule(["bird"], "lays_eggs"))
    kb.add_rule(Rule(["lays_eggs"], "reproduces"))
    kb.add_rule(Rule(["mortal", "thinks"], "philosopher"))
    kb.add_fact("human")
    kb.add_fact("has_feathers")
    kb.add_fact("thinks")
    return kb


def main():
    kb = build_default_kb()
    print(" Lightweight AI Inference Shell Initialized!")

    while True:
        print_menu()
        choice = input("Enter choice: ").strip()

        if choice == "1":
            kb.show()

        elif choice == "2":
            fact = input("Enter new fact: ").strip()
            kb.add_fact(fact)
            print(f" Added fact: {fact}")

        elif choice == "3":
            ants = input("Enter antecedents (comma separated): ").split(",")
            ants = [a.strip() for a in ants if a.strip()]
            cons = input("Enter consequent: ").strip()
            kb.add_rule(Rule(ants, cons))
            print(" Rule added.")

        elif choice == "4":
            fc = ForwardChaining(kb)
            fc.infer()

        elif choice == "5":
            goal = input("Enter goal to query: ").strip()
            bc = BackwardChaining(kb)
            result = bc.query(goal)
            if result:
                print(f"\n {goal} can be inferred!")
            else:
                print(f"\n {goal} cannot be inferred.")

        elif choice == "6":
            filename = input("Enter filename (default: knowledge.json): ").strip() or "knowledge.json"
            kb.save(filename)

        elif choice == "7":
            filename = input("Enter filename to load (default: knowledge.json): ").strip() or "knowledge.json"
            kb.load(filename)

        elif choice == "8":
            print(" Exiting AI Shell. Goodbye!")
            break

        else:
            print(" Invalid choice. Try again.")

if __name__ == "__main__":
    main()
