package collection.map.test;

import java.util.HashMap;

public class MemberRepository {

    HashMap<String, Member> memberMap = new HashMap<>();

    public void save(Member member) {
        memberMap.put(member.getId(), member);
    }

    public Member findById(String id) {
        return memberMap.get(id);
    }

    public Member findByName(String name) {
        for (Member member : memberMap.values()) {
            if(member.getName().equals(name)) {
                return member;
            }
        }
        return null;
//        return memberMap.values()
//                .stream()
//                .filter(member -> member.getName().equals(name))
//                .findFirst()
//                .orElse(null);
    }

    public void remove(String id) {
        memberMap.remove(id);
    }
}
