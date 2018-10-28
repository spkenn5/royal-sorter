import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		String[] names = {"Philips II","Stephen VI", "Stephen VII", "Kenji XVII","James V","Bob XL"};
		String[] names2 = {"Louis IX","Louis VIII","David II"};
		String[] names3 = {"George VI", "William II", "Elizabeth I", "William I"};
		
		for(String s : getSortedList(names3)){
			System.out.print(s + " ");			
		}
	}
	
	public static String[] getSortedList (String[] names) {		
		for(int i = 0; i < names.length;i++){
			for(int j = i+1; j< names.length;j++){
				if(i != j){					
					String temp2 = "";
					String name1 = getName(names[i]);
					int order1 = getOrder(names[i]);
					String name2 = getName(names[j]);
					int order2 = getOrder(names[j]);
					if(name1.compareTo(name2) > 0){
						temp2 = names[i];
						names[i] = names[j];
						names[j] = temp2;
					}else if(name1.compareTo(name2) == 0){
						if(order1 > order2){
							temp2 = names[i];
							names[i] = names[j];
							names[j] = temp2;
						}
					}
				}
			}
		}
		return names;
	}
	
	private static String getName(String obj){
		return obj.split(" ")[0];
	}
	
	private static int getOrder(String obj){
		return getNumeric(obj.split(" ")[1]);
	}
	
	private static int getNumeric(String roman) {
		Map<Character,Integer> romanList = new HashMap<>();
		romanList.put('I', 1);
		romanList.put('V', 5);
		romanList.put('X', 10);
		romanList.put('L', 50);
		romanList.put('C', 100);
		romanList.put('D', 500);
		romanList.put('M', 1000);
		
		int total = 0;
		int temp = 0;
		char[] chars = roman.toCharArray();
		
		for(int i = (chars.length-1); i >= 0 ;i--){
			if(temp <= romanList.get(chars[i])){
				total += romanList.get(chars[i]);				
			}else {
				total -= romanList.get(chars[i]);
			}
			temp = romanList.get(chars[i]);
		}
		
		return total;
	}
}
