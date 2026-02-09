package collections;
class Student1{
	int rollNo;
	String name;
	Student1(int rollNo, String name){
		this.rollNo=rollNo;
		this.name=name;
	}
	public String toString() {
		return "Student1 [rollNo=" + rollNo + ",name=" + name +"]";
	}
}
public class BubbleObject {

	public static void main(String[] args) {
		Student1[] arr = { new Student1(5, "Aman"), new Student1(2, "Ravi"), new Student1(8, "Neha"),
				new Student1(1, "Shivam"), new Student1(4, "Pooja"), new Student1(3, "Kunal") };

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {

				if (arr[j].rollNo > arr[j + 1].rollNo) {
					Student1 t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
