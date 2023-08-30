package Visitor;

public class ListVisitor extends Visitor {
	private String currentdir = "";

	@Override
	public void visit(File file) {
		System.out.println(currentdir + "/" + file.getName());
	}

	@Override
	public void visit(Directory directory) {
		System.out.println(currentdir + "/" + directory.getName());
		String savedir = currentdir;
		currentdir = currentdir + "/" + directory.getName();
		for(Entry entry : directory) {
			entry.accept(this);
		}
		currentdir = savedir;
		
		System.out.println(directory.getSize());
	}
	
}
