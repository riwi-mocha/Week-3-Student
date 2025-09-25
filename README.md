# Feature: Student M.S.

Description: The system should simulate a simple in-memory repository for managing students, as preparation for working with JDBC. Students will design an abstract base class, extend it with a student entity, define a repository interface, and implement it using collections such as HashMap and ArrayList. The repository must allow creating, retrieving, deleting, and listing students, mimicking the core operations of a database layer.

## Acceptance Criteria:

Scenario: Create and extend an abstract class Given an abstract class representing a generic person When I extend it with a student class Then the student contains additional attributes and overrides its abstract method.

Scenario: Define a repository interface Given an interface specifying CRUD-like operations When I implement the interface Then it defines methods to save, find by ID, delete, and list all students.

Scenario: Implement repository with HashMap Given a repository implementation backed by a HashMap When I save multiple students Then they are stored with their IDs as keys and can be retrieved correctly.

Scenario: Return results as a list Given students stored in the repository When I call the method to list all Then I get an ArrayList containing all current students.

Scenario: Mimic database operations Given the in-memory repository When I insert, query, and delete students Then the behavior corresponds to INSERT, SELECT, and DELETE operations in a real database.

---
## Student M.S.
Imagine you are building a small student management system. Right now, there is no database connected, so all the information will be stored in memory.

The company wants a structure that looks as close as possible to how data will later be handled with a real database through JDBC. For that reason:

Every student must inherit from a more generic person type.
The system must expose a contract (interface) that defines the basic operations to manage the information.
The data must be organized in such a way that it can be stored, retrieved, and listed efficiently (think of collections like lists and maps).
The repository should allow adding new students, finding them by their ID, removing them, and listing all of them.
At the end, you should be able to:

Create several students in memory.
Store them in your repository.
Query them by ID or see them all together.
Simulate simple operations that later, with JDBC, will correspond to insert, select, delete, and select all queries.