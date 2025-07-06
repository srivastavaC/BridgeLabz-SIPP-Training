class TextState {
    String content;
    TextState prev;
    TextState next;

    public TextState(String content) {
        this.content = content;
        this.prev = null;
        this.next = null;
    }
}

public class TextEditor {
    private TextState head = null;
    private TextState current = null;
    private int size = 0;
    private final int MAX_HISTORY = 10;

    public void type(String newText) {
        TextState newState = new TextState(newText);

        if (current != null) {
            current.next = null;
        }

        newState.prev = current;
        if (current != null) {
            current.next = newState;
        } else {
            head = newState;
        }

        current = newState;
        size++;

        if (size > MAX_HISTORY) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("Nothing to undo.");
        }
    }

    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("Nothing to redo.");
        }
    }

    public void displayCurrentState() {
        if (current == null) {
            System.out.println("Editor is empty.");
        } else {
            System.out.println("Current Text: " + current.content);
        }
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.type("Hello");
        editor.type("Hello, World!");
        editor.type("Hello, World! How");
        editor.type("Hello, World! How are");
        editor.type("Hello, World! How are you?");
        editor.displayCurrentState(); 

        editor.undo();
        editor.displayCurrentState(); 

        editor.undo();
        editor.displayCurrentState(); 

        editor.redo();
        editor.displayCurrentState(); 

        editor.type("Hello, World! How are you doing?");
        editor.displayCurrentState(); 

        editor.redo(); 

        for (int i = 0; i < 10; i++) {
            editor.type("Edit " + i);
        }

        editor.displayCurrentState();
        editor.undo();
        editor.displayCurrentState();
    }
}
