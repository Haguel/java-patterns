### Assignment: Document Management System 📄

You are tasked with building a simple document management system. The system needs to handle different types of documents, like Word documents and PDF documents. Each document type has a specific way of being opened and saved, but the overall process of creating and working with a document (e.g., `create`, `open`, `save`) is standardized.

This is a perfect scenario for the **Factory Method** pattern. You'll create a generic `DocumentProcessor` that doesn't know the concrete type of document but relies on its subclasses to create the appropriate one.

**Your Task:**

1.  Create a common `Document` interface with methods like `open()` and `save()`.
2.  Create concrete product classes that implement the `Document` interface: `WordDocument` and `PdfDocument`. Their `open()` and `save()` methods should just print a message to the console (e.g., "Opening Word document...").
3.  Create an abstract `DocumentProcessor` class. This class will contain some business logic, for example, a method `processDocument()` which first opens and then saves a document.
4.  The `DocumentProcessor` class must declare an abstract factory method, e.g., `abstract Document createDocument();`.
5.  Create concrete creator classes: `WordProcessor` and `PdfProcessor` that extend `DocumentProcessor`. Each of these classes must implement the `createDocument()` method to return the appropriate document type (`WordDocument` or `PdfDocument`).
6.  In your `Main` class, demonstrate how a client can use `WordProcessor` and `PdfProcessor` to work with different document types without knowing their specific implementation details.

### Solution Template

Your document interfaces/classes:

~~~java
// Document.java (interface)

// WordDocument.java (concrete product)

// PdfDocument.java (concrete product)
~~~

Your processor classes:

~~~java
// DocumentProcessor.java (abstract creator)

// WordProcessor.java (concrete creator)

// PdfProcessor.java (concrete creator)
~~~

Your `Main.java` file for demonstration:

~~~java
// Main.java
public class Main {
    public static void main(String[] args) {
        // Demonstrate your factory method implementation here
    }
}
~~~