public class Canister<TYPE extends Liquid> {
    private TYPE content;

    public Canister(TYPE content) {
        this.content = content;
    }

    public TYPE getContent() {
        return content;
    }

    public void setContent(TYPE content) {
        this.content = content;
    }
}
