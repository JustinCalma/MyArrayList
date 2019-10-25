public class MyArrayList {
	
	public int size = 3;
	public String[] myList = new String[size];
	public int currIndex = 0;

	public void add(String addValue) {

		if (currIndex == size) {
			resize(size +1);
			set(currIndex, addValue);
			currIndex++;

		} else {
			myList[currIndex] = addValue;
			currIndex++;
		}
	}
	
	public void set(int i, String newAddValue) {

		myList[i] = newAddValue;
	}

	private void resize(int newSize) {

		String[] tempArr = new String[newSize];
		for (int i = 0; i < tempArr.length -1; i++) {
			tempArr[i] = myList[i];
		}
		myList = tempArr;
	}

	public String toString() {

		String string = "";
		for (int i = 0; i < myList.length; i++) {
			if (myList[i] != null) {
				string = string + i + ": " + myList[i] + "\n";

			} else {
				break;
			}
		}
		return string;
	}

	public static void main (String[] args) {
		MyArrayList myList = new MyArrayList();
		myList.add("First");
		myList.add("Second");
		myList.add("Third");
		myList.add("Fourth");
		System.out.println(myList);
	}
}
