package edu.hanyang.submit;

import edu.hanyang.indexer.Tokenizer;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class TinySETokenizer implements Tokenizer {
	String text;
	List<String> array = new ArrayList<>();
	public void setup() {
		text = "I am a boy";
	}

	public List<String> split(String text) {
		//List<String> array = new ArrayList<>();
		StringTokenizer tokens = new StringTokenizer(text, " ");
		while (tokens.hasMoreElements()) {
			array.add(tokens.nextToken());
		}
		return array;
	}
	public void clean() {
		for(int i=0; i<array.size(); i++){
			System.out.println(array.get(i));
		}
		array.clear();
	}

}