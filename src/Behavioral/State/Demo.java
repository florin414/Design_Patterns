package Behavioral.State;

public class Demo {

    /**
     * This design pattern adds new behaviour to an object when a specific state is found. In this
     * example, the document has 3 states: draft, in moderation, published. These states will be switched
     * automatically from 'draft' to 'in moderation' to 'published'.
     *
     * Checklist:
     *
     * 1. Define a hierarchy of states of your domain object.
     * 2. Create implementations and concrete classes of states implementing behaviour that should
     * be different based on the state of your domain object.
     * 3. Make sure you gave API to pass object to state classes (either via constructor or setter).
     * 4. Make sure that your domain object contains a reference to the most relevant state object.
     * 5. Update state of domain object when needed.
     * 6. Delegate method calls on domain object to current state object.
     */

    public static void main(String[] args) {
        Document document = new Document();
        User adminUser = new User(InModerationState.ADMIN_ROLE, "user1");
        User contentCreatorUser = new User(InModerationState.CONTENT_CREATOR_ROLE, "user2");

        document.printStatus();

        document.publish(contentCreatorUser);
        document.printStatus();

        document.publish(contentCreatorUser);
        document.printStatus();

        document.publish(adminUser);
        document.printStatus();

        document.publish(adminUser);
    }
}