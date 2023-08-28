
package Manager;

public class HTMLBuilder extends Builder {
  

    @Override
    void makeTitle(String title) {
        this.title = title;
        sb.append("<html>");
        sb.append("<head><title>").append(title).append("</title></head>");
        sb.append("<body>");
        sb.append("<h1>").append(title).append("</h1>");
    }

    @Override
    void makeList(String[] items) {
        this.contentItems = items;
        sb.append("<ul>");
        for (String item : contentItems) {
        	sb.append("<li>").append(item).append("</li>");
        }
        sb.append("</ul>");
        sb.append("</body>");
        sb.append("</html>");
    }


    public String getResult() {
        return sb.toString();
    }
}