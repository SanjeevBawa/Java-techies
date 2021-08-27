import java.util.HashMap;
import java.util.Map;

class TestOnly {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("a", "aa");
		map.put("b", "bb");
		map.put("c", "");
		System.out.println(mapAB4(new HashMap()));
	}

	public static Map<String, String> mapAB4(Map<String, String> map) {
		if (map == null && map.isEmpty()) {
			return new HashMap<String, String>();
		}

		if (map.containsKey("a") && map.containsKey("b")) {
			String a = map.get("a");
			String b = map.get("b");
			if (a.length() == b.length()) {
				map.put("a", "");
				map.put("b", "");
				return map;
			}
			if (a.length() > b.length()) {
				map.put("c", a);
			}
			{
				map.put("c", b);
			}
		}
		return map;
	}

}
