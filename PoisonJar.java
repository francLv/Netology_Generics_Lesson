public class PoisonJar<T extends Liquid & Poisonable> {

    private T content;

    public PoisonJar(T content){
        this.content = content;
    }

    public T getContent(){
        return content;
    }

    public void setContent(T content){
        this.content = content;
    }
}
