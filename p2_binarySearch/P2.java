class P2 {

	public static void main(String args[]) {
		int[] list = {2,4,7,10,11,45,50,60};
		binarySearch(list, 50);
	}

	public static void binarySearch(int[] list, int key) {

		int high = list.length - 1;
		int low = 0;
		for(int i=0; i < list.length; i++) {
			int mid = (low + high) / 2;
			if(key < list[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
			if(key == list[mid]) {
				System.out.println("the key of " + key + " is index " + mid);
				break;
			}
		}

	}

}
