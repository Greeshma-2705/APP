// Confidential.java
// Tagging (marker) interface - contains no methods or fields
interface Confidential {
}

// Document.java
class Document {
    private String title;
    private String content;

    public Document(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void display() {
        System.out.println("Document Title: " + title);
        System.out.println("Content: " + content);
    }
}

// PublicDocument.java
class PublicDocument extends Document {
    public PublicDocument(String title, String content) {
        super(title, content);
    }
}

// ConfidentialDocument.java
// Implements the Confidential tagging interface
class ConfidentialDocument extends Document implements Confidential {
    public ConfidentialDocument(String title, String content) {
        super(title, content);
    }
}

// Main.java
public class DocumentSystem {
    public static void main(String[] args) {
        Document doc1 = new PublicDocument("Company Announcement", "Welcome to the new fiscal year!");
        Document doc2 = new ConfidentialDocument("Financial Report Q3", "Confidential revenue figures and projections.");
        Document doc3 = new PublicDocument("User Manual", "Guide on how to use the software.");
        Document doc4 = new ConfidentialDocument("Employee Passwords", "List of system access credentials.");

        Document[] documents = {doc1, doc2, doc3, doc4};

        System.out.println("--- Document Management System ---\n");

        for (Document doc : documents) {
            doc.display();
            
            // Check if the document implements the Confidential tagging interface
            if (doc instanceof Confidential) {
                System.out.println("[CLASSIFIED]: This document is CONFIDENTIAL.");
            } else {
                System.out.println("[PUBLIC]: This document is PUBLIC.");
            }
            System.out.println("-----------------------------------");
        }
    }
}