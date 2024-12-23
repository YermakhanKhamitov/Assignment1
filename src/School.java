import java.util.ArrayList;
import java.util.List;

class School {
    private List<Person> members;

    public School() {
        this.members = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Person member : members) {
            sb.append(member.toString()).append("\n");
        }
        return sb.toString();
    }

    public void addMember(Teacher teacher) {
        members.add(teacher);
    }

    public void addMember(Student student) {
        members.add(student);
    }
}