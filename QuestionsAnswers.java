import java.util.HashMap;
import java.util.Random;

/**
			*	A	half-secretive	map	of	questions	to	answers	(at	most	one	answer	per	question).
			*	Gives	out	random	questions	(keys)	from	the	map,	and
			*	can	be	queried	to	test	if	a	given	question	maps	to	a	given	answer.
			*/
		public	class	QuestionsAnswers{
			
			public static HashMap<String,String> hm = new HashMap<String,String>();
			
				/**
				*	Maps	question	to	answer.
				*/
				void	put(String	question,	String	answer)	{
					hm.put(question, answer);
				}
					
				/**
				*	Queries	if	question	maps	to	answer.
				*/
				boolean	testAnswer(String	question,	String	answer)	{
					if(hm.get(question)!=answer){
						return false;
					}
					else{
						return true;
					}
				}
			
				/**
				*	Gives	out	a	random	question	from	the	key	set.
				*/
				String	getRandomQuestion(){
					Random rand  = new Random();
					int n = rand.nextInt(hm.size()) +1;
					
					String randomQuestion = "";					
					int counter = 0;
					for(String x:hm.keySet()){
						if(counter == n){
							randomQuestion = x;
						}
						counter++;
					}
					return randomQuestion;
				}
		}