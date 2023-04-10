public class 7_Sortastack {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
		while(!stack.isEmpty()){
			list.add(stack.pop());
		}
		Collections.sort(list);
		for(int i=0;i<list.size();i++){
			stack.push(list.get(i));
		}
    }
}
