package level2.kakao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 오픈채팅방 {

	/**
	 * Enter id name - name님이 들어왔습니다. Leave id - name님이 나갔습니다. Change id name - name 변경
	 */
	public String[] solution(String[] record) {
		Users users = new Users();
		List<String> messages = new ArrayList<>();
		List<String> ids = new ArrayList<>();

		for (String message : record) {
			if (message.startsWith("Enter")) {
				String[] split = message.split(" ");
				String id = split[1];
				String name = split[2];
				users.put(id, name);
				messages.add("%s님이 들어왔습니다.");
				ids.add(id);
			} else if (message.startsWith("Leave")) {
				String[] split = message.split(" ");
				String id = split[1];
				messages.add("%s님이 나갔습니다.");
				ids.add(id);
			} else if (message.startsWith("Change")) {
				String[] split = message.split(" ");
				String id = split[1];
				String name = split[2];
				users.put(id, name);
			}
		}

		String[] answer = new String[messages.size()];
		for (int i = 0; i < messages.size(); i++) {
			answer[i] = String.format(messages.get(i), users.get(ids.get(i)));
		}

		return answer;
	}

	private static class Users {

		Map<String, String> users;

		Users() {
			users = new HashMap<>();
		}

		Users put(String id, String name) {
			users.put(id, name);
			return this;
		}

		String get(String id) {
			return users.get(id);
		}
	}

}
