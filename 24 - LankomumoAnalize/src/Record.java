import java.time.LocalDateTime;
import java.util.Objects;

public class Record {
String fullName;
LocalDateTime joinTime;
LocalDateTime leaveTime;
int duration;
String email;
String role;
String id;
public Record(String fullName, LocalDateTime joinTime, LocalDateTime leaveTime, int duration, String email, String role,
		String id) {
	super();
	this.fullName = fullName;
	this.joinTime = joinTime;
	this.leaveTime = leaveTime;
	this.duration = duration;
	this.email = email;
	this.role = role;
	this.id = id;
}
@Override
public int hashCode() {
	return Objects.hash( id);
}

			 


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Record other = (Record) obj;
	return Objects.equals(id, other.id);
}
public String getFullName() {
	return fullName;
}
public void setFullName(String fullName) {
	this.fullName = fullName;
}
public LocalDateTime getJoinTime() {
	return joinTime;
}
public void setJoinTime(LocalDateTime joinTime) {
	this.joinTime = joinTime;
}
public LocalDateTime getLeaveTime() {
	return leaveTime;
}
public void setLeaveTime(LocalDateTime leaveTime) {
	this.leaveTime = leaveTime;
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
private static String printNiceDate(LocalDateTime time) {
	return time.toString().replace("T", " ");
	
}
@Override
public String toString() {
	return "\n ***Record ID: " + id + ",\n  Name and Surename: " + fullName + ","
			+ "\n Joining Time: " + printNiceDate(joinTime)  + ",\n Leaving Time: " + printNiceDate(leaveTime) + ","
			+ "\n Total Duration in Minutes: " + duration + ", Role: "+ role+ ", \n "
					+ "Email: " + email + "\n";
}

}
