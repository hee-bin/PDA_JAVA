package Manager;


public abstract class Builder {
	protected String title;
    protected String[] contentItems;
    StringBuilder sb = new StringBuilder();


    abstract void makeTitle(String title);
    abstract void makeList(String[] items);
	abstract String getResult();
    
}
