package Base;

public abstract class BaseForm {
    private BaseElement uniqueElement;
    protected String name;

    public BaseForm(BaseElement element, String name){
        this.uniqueElement = element;
        this.name = name;
    }
}
