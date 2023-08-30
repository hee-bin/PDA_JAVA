package Proxy;

/**
 * Printable 인터페이스는 각각 printer와 printerProxy파일에 붙습니다.
 * @author 정희빈
 */
public interface Printable {
	/**
	 * 프린터의 이름을 설정합니다.
	 * @param name
	 */
	public abstract void setPrinterName(String name);
	
	/**
	 * 프린터의 이름을 가져옵니다.
	 */
	public abstract void getPrinterName();
	
	/**
	 * 주어진 문자열을 출력합니다.
	 * @param string
	 */
	public abstract void print(String string);
	

}
