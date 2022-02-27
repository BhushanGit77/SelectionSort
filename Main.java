class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    int [] nums = {99,44,6,2,1,5,63,87,283,4,0};

    Main mn = new Main();
    mn.selectionSort(nums);

    for(int num : nums) {
      System.out.println(num);
    }
  }

  public void selectionSort(int [] nums) {

    for(int i = 0; i < nums.length; i++) {
      int index = i;
      for(int j = i+1; j < nums.length; j++){

        if(nums[j] < nums[index]){
          index = j;
        }
      }
      int temp = nums[i];
      nums[i] = nums[index];
      nums[index] = temp;
    }
  }
}