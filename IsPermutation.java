class IsPermutation{

	public boolean res = false;
	public IsPermutation(String[] args){

		String word_1 = args[0];
		String word_2 = args[1];

		if(word_1.length() != word_2.length()){
			return;
		}

		int[] char_array = new int[500];
		boolean is_perm = true;

		for(int i = 0; i < word_1.length(); i++){

			char this_char = word_1.charAt(i);
			int char_num = Character.getNumericValue(this_char);

			char_array[char_num]++;

		}

		for(int i = 0; i < word_2.length(); i++){

			char this_char = word_2.charAt(i);
			int char_num = Character.getNumericValue(this_char);

			char_array[char_num]--;

			if(char_array[char_num] < 0){
				is_perm = false;
			}

		}

		if(is_perm){

			res = true;

		}

	}

}
