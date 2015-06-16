package com.example.care_247;



import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Homerem extends Activity{
	
	AlertDialog levelDialog;
	Button b;
	TextView v;
	String s;

	AlertDialog.Builder builder;
	final CharSequence[] items = {

"Acne",
	

"Asthma",


 
"Acidosis", 

"Amnesia",
 
"Bladder Infections" ,

"Bronchitis", 

"Body Odour" ,

"Cancer" ,

"Cholesterol",

"Cough", 

"Common cold",

"Constipation", 

"Colitis",

"Diabetes" ,
"Dandruff",

"Dyspepsia",

"Dysentery",

"Gastritis", 

"Gout",

"Hair Loss", 

"Head Ache", 

"High blood pressure",
"Hysteria ", 

"Insomnia" , 

"Low blood pressure" ,

"Menstrual Problems",

"Osteoporosis",

"Respiratory",  

"Stress",

"Weight Loss", };
	Button b1;
	
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.homerem);
			v=(TextView)findViewById(R.id.textView2);
			

			 builder = new AlertDialog.Builder(this);
					b1=(Button)findViewById(R.id.button1);
					b1.setOnClickListener(new View.OnClickListener() {
						
						public void onClick(View arg0) {
							 builder.setTitle("Select The Disease");
						        builder.setSingleChoiceItems(items, -1, new DialogInterface.OnClickListener() {
						        public void onClick(DialogInterface dialog, int item) {
						           
						            
						            switch(item)
						            {
						                case 0:
						                	
						                	
 s=" Pimples are very common in young people during their teen years. This condition which is also know as acne , is apparently due to certain hormone changes within the body . It is particularly prevalent during early adolescence, from twelve to sixteen years of age and is more likely to occur in those who have an oily skin. In the early stages a black head or comedone blocks the outlet of an oil gland within in the skin. This is not a serious problem, for it leaves no permanent effect.\n\n"+
 "Orange: The orange peel is valuable in the treatment   of pimples and acne. The peel , pounded well with water on a piece of stone, should be applied to the affected areas. It is said to be more effective , if it is pounded with the rain water.\n\n"+
"Diet : Avoid all rich foods, excessive amounts of sugar and particularly chocolate and nuts. Especially young girls who are real fond of chocolates think about your beautiful face before eating themChoose a plain, well balanced diet containing plenty of fresh fruits and vegetables. Drink water and fruit juices, but avoid highly sweetened drinks. Extra vitamin A tablets should be added to the diet.Try to sleep at least eight hours every night. Avoid all nervos strain and follow the principles of good living as far as possible for these are essential to health.";


						                  v.setText(s);
						                        
						                        break;
						            }
						            switch(item)
						            {
						                case 1:
						              s="1. Ginger\n"+
"Ginger is a well-known natural treatment for various ailments including asthma. Researchers have found that it can help reduce airway inflammation and inhibit airway contraction.Plus, studies indicate that it has compounds that may enhance the muscle relaxant effects of certain asthma drugs.\n \n"+
".Mix equal quantities of ginger juice\n\n"+" .pomegranate juice and honey. Consume one tablespoon of this mixture two or three times a day.\n\n"+
".Alternatively, you can mix one teaspoon of ground ginger in one and a half cups of water and take one tablespoon of this mixture at bedtime.\n\n"+
".Cut one inch of ginger into small pieces and add it to a pot of boiling water.\n\n"+".Let it steep for five minutes, allow it to cool down and then drink it.\n\n"+
".To detoxify your lungs, prepare a fenugreek decoction by boiling one tablespoon of fenugreek seeds in a cup of water and mixing one teaspoon each of ginger juice and honey in it. Drink this solution every morning and evening.You can also eat raw ginger mixed with salt.";
                                             						                       
						                  v.setText(s);
						                        
						                        break;
						            }
						            switch(item)
						            { 
						            case 2:
						            	s="Home Remedies are very much effective in the treatment of acidosis.Raisins is the most effective remedy for acidosis.This dry fruit,with its excess of alkalinity is helpful in maintaining the acid balance of the body.\n\n"+"Spinach is another effective home remedy for reducing acidosis.This leafy vegetable is rich source of calcium and other alkaline elements,which are helpful in keeping the tissues clean and for preserving the alkalinity of blood.\n\n"+"Tomato is a best remedy for acidosis It is a alkaline vegetable.This vegetable increases the alkalinity of the blood and decreases that of the urine and neutralizes the acid compounds of the body such as phosphates,urea and ammonia.";
						            	v.setText(s);
				                        
				                        break;
				            }
						            switch(item)
						            { 
						            case 3:
						            s="Amnesia is commonly know as memory loss diseases. The persons who are affected by this diseases  forgot words and names.This can be cured by some home remedies which are prepared in home by our selves.\n\n"+"Using of apples is best home remedy for amnesia. The chemicals substances in this fruit help cure this memory loss diseases.\n\n"+"Almond is effective remedy for strengthen brain.It contains unique properties to remove brain debility and to overcome brain diseases.This dry fruit has miracles ability to cure nerves disorders.";
						            v.setText(s);
			                        
			                        break;
			            }
						           
						            switch(item)
						            { 
						            case 4:
						            	s="Here are several strategies to reduce the risk of UTIs:\n"+

   ">Drink plenty of water.\n"+
   ">Visit the toilet before and after sex.\n"+
   ">Wipe from front to back.\n"+
   "> Avoid feminine hygiene sprays.\n"+
  ">Take showers instead of baths.";
						            	v.setText(s);
				                        
				                        break;
				            }
						            switch(item)
						            { 
						            case 5:
						            	s="Turmeric powder is very effective home remedy for bronchitis. A teaspoonful of turmeric powder should be administered with a glass of milk two or three times daily.For better results take it on an empty stomach.\n"+"                      Onion is another natural remedy for bronchitis,onion posses expectorant properties that liquefies phlegm and prevents its further formation. One teaspoon of raw onion juice,the first thing in the morning will be highly beneficial.";
						            	v.setText(s);
				                        
				                        break;
						            }
						            switch(item)
						            { 
						            case 6:
						            	
	s="A magnesium and zinc deficiency,diabetes,liver disease,chronic constipation can give rise to body odour. It is not certain how zinc and magnesium supplements help eliminate body odour but they work. So incorporate magnesium in your diet.Natural dietary sources of magnesium are almonds,soyabeans,leafy vegetables,oats and wheat germ. Zinc naturally fond in eggs,motton,chicken,wheat,soyabean,corn,sesame,wheat germ.etc";
						           
						            v.setText(s);
			                        
			                        break;
					             }
						            switch(item)
						            { 
						            case 7:
						            	s="Diet and yogic management and essential nature cure treatment to the cancer patient to be given after thorough case study and as per the severity of disease, vitality and actual requirement of fight against cancerous growth. Diet based on high fiber,  phytochemical,  lycopene, cruciferous,  alpha and beta carotene, anthrocyanines, citrus fruits,  vitamin A, B  & E are advised.  Also patients are advised to just have a brisk walk for 30 minutes and drink adequate water and liquid which helps to dilute the carcinogens and helps elimination.  Seasonal and dark green leafy vegetables, tulsi, turmeric, soya, lemon, orange, amla, garlic are huge source of dietary fiber.  Vitamin C, K folic acid, calcium, magnesium, iron, revitalizing tannins, anti microbial Omega-3 Fatty acids and potassium guards our heart and memory.  Nuts are excellent source of protein, magnesium, Vitamin B & E and whole grain which have more than 96% fiber magnesium, zinc and vitamins.  All these help to build immunity and they fight the war against cancer and protect entire system.\n\n"+"Simple Nature cure treatments and yogic practices including Pranayama and relaxation techniques can be easily learnt.  The purpose of holistic healing therapy is to establish harmony among various organs and systems in the body which has to carry out their functions with complete co-ordination. It boosts up the spirit and immunity of the patients and effectively deals with stress. It leads to increased activity in the area of the brain which is linked to a good mood.";
						            	v.setText(s);
				                        
				                        break;
						            }
						            switch(item)
						            { 
						            case 8:
						            	s="Nature cure for high blood pressure and cholesterol.\n\n"+"It is better to take eight to ten glass of water daily.water stimulates the excretory activity of the skin and kidneys. This is turn facilitates elimination of excessive cholesterol from the system.\n\n"+"Drinking of coriander water also helps lower blood cholesterol as it is a good diuretic and stimulates the kidneys.It is prepared by boiling dry seeds of coriander and straining the decoction after cooling.";
						            	v.setText(s);
				                        
				                        break;
						            }
						            switch(item)
						            { 
						            case 9:
						            	
						            	s="Nature cure remedies for cough\n\n"+"Grapes are good for the cure of cough when it is mixed with honey is very effective."+"Almonds are useful and effective remedy for dry cough.\n\n"+"Onion is the most effective remedy for cough.\n\n"+
"In case of dry cough root of turmeric is useful.";
                                    v.setText(s);
				                        
				                        break;
						            }
						            switch(item)
						            { 
						            case 10:
						            	s="1. Garlic\n"+

"Garlic’s antibacterial and antiviral properties can be very helpful in getting rid of cold symptoms. Garlic is good for the immune system and helps open up respiratory passages, and also helps flush toxins out of your body.\n"+   " Mix together one crushed garlic clove, two teaspoons lemon juice, one teaspoon honey, and half a teaspoon cayenne pepper or red chilli powder.\n"+"Consume it daily until the symptoms subside.\n"+
"Boil four to five chopped garlic cloves in a cup of water and add one teaspoon of honey.\n"+" Drink it two to three times a day\n."+
"You can also eat raw garlic or use a few drops of garlic oil in your food and drinks.";

						            	v.setText(s);
				                        
				                        break;
						            }
						            switch(item)
						            { 
						            case 11:
						            	s="Some good fiber-filled foods help in removing constipation\n"+"Beans\n"+
						            			"-Apricots\n"+
						            			"-Whole grain bread\n"+
						            			"-Berries\n"+
						            			"-Broccoli\n"+
						            			"-Plums, pears, and apples\n"+"Caffeine is a natural stimulant for the digestive system, so indulging in a cup of joe will help get you up\n";
						            	v.setText(s);
				                        
				                        break;
						            }
						            switch(item)
						            { 
						            case 12:
						            	s="Home remedies for colitis\n\n."+"Ripe bananas are very effective in the cure of ulcerative colitis. They relieve acute symptoms and promote healing.\n\n"+"Butter milk is another effective home remedy for ulcerative colitis.\n"+"Coked apple is another effective remedy .It has healing property because of its ample concentration of iron and phosphorus.";
						            	v.setText(s);
				                        
				                        break;
						            }
						            switch(item)
						            { 
						            case 13:
						            	s="Here are some important home remedies for diabetes.\n\n"+"Bitter gourd seeds are very effective in curing diabetes.The juice of four or five bitter gourd fruits in the morning is very beneficial.The powder of this seeds is also very useful for diabetes.\n"+"Jambul fruit is known as very beneficial in curing diabetes. The powder of this seed and fruit juice is known as traditional medicine in diabetes treatment.\n"+"The powder of fenu greek seeds in the morming with empty stomch is also very useful remedy for diabetes.";

                                     v.setText(s);
				                        
				                        break;
						            }
						           
						            switch(item)
						            { 
						            case 14:
						            	s="The following are some home remedies.\n"+"Fenu Greek: Two spoons of this seeds should soaked over night in water and this seeds paste should applied to the scalp for half an hour and then it should be washed."+"Lime Juice:Lime juice is very beneficial in curing dandruff, a spoon of lime juice should applied to the scalp and then it should be washed.\n"+"Green Gram: The green gram powder in curd is useful in dandruff. Washing of hair twice in a week with this powder is very useful.";
						            	v.setText(s);
				                        
				                        break;
						            }
						            switch(item)
						            { 
						            case 15:
		s="Natural Remedies or Home Remedies for the cure of dyspepsia.\n"+"Home remedies like ginger is very effective in the cure of dyspepsia.Chew about one gram of ginger with powder of rock salt before meals is a good remedy.For flatulence and gas garlic is an excellent remedy. It neutralizes putrefactive toxins and kills unhealthy bacteria. It also eliminates gas and help digestion.";
				
						            	v.setText(s);
				                        
				                        break;
						            }
						            switch(item)
						            { 
						            case 16:
						            	s="Home Remedies for the cure of dysentery.\n"+"1.Bael fruit is most effective in the treatment of dysentery.Pulp of the fruit with jaggery is very much effective.For chronic condition of dysentery the unripe fruit roasted and the pulp mixed with water.Large quantities of the infusion so made should be administered with jaggery. The pulp of unripe fruit mixed with an equal quantity of dried ginger can also be given mixed with butter milk.\n\n"+"The use of pomegranate rind is another effective remedy for dysentery.About 60 grams of the rind should be boiled in 250 ml of milk.It should be removed from the fire when one-third of the milk has evaporated.It should be administered to the patient in three equal doses at suitable intervals.\n\n"+"Lemon juice is very effective in dealing with ordinary cases of dysentery. A few lemon,peeled and sliced,should be added to 250 ml of water and boiled for a few minutes. The strained infusion should be given thrice daily.";
						            	v.setText(s);
				                        
				                        break;
						            }
						            switch(item)
						            { 
						            case 17:
						            	s="some methods for removing gas\n"+"1. Mint for digestive disorders.\n"+"Mint is an excellent appetizer. Its fresh juice is beneficial in the treatment of indigestion biliousness,flatulent colic,thread worms and morning sickness.It should be taken mixed with a teaspoon of lime juice and honey thrice a day.\n\n"+"2.Ginger for the treatment of abdominal disorders\n"+

"Ginger is a valuable drug for disorders of the digestive system. It is extremely useful in dyspepsia,flatulence,colic,nausea,vomiting,spasms, and other painful affection of the stomach and bowel.";


						            	v.setText(s);
				                        
				                        break;
						            }
						            switch(item)
						            { 
						            case 18:
						            	s="Remedies\n"+"1.       Raw vegetables combined juices by carrot, beetroot and cucumber are beneficial to his disease, when taken daily once or twice for a weak.\n"+
"2.The patient may use bananas daily as his food for a weak."+
"3.Apples are also good remedy , when gouts occurs because they contain malic acid in them .Apples thus used, neutralizes the uric acid and gives relief from pain to the patients.\n"+
"4.Lime juice is also protective against gout . Because limejuice contains the Vitamin C and also the citric acid which  is solvent of the uric acid . Lime juice may be taken daily twice for a couple of days for the recovery from the disease.\n"+
"5.The use of orange juice is the best remedy for gout ,  of all.\n"+
"6.Epsom salts Baths are very beneficial to the sufferers of this disease.\n"+
"7.Walk in fresh air and out  door exercise are needful for the patients , suffered by the gouts.";
						            	v.setText(s);
				                        
				                        break;
						            }
						            switch(item)
						            { 
						            case 19:
						            	s="Home remedies for hair lose\n\n"+" 1.Paste prepared from fresh leaves and flowers of hibiscus should applied on the scalp for treatment of dandruff. It is good for hair growth too. hibiscus shampoo prevents hair fall.\n"+"2.Indian gooseberry is an accepted hair tonic in traditional recipes for enriching hair growth and hair pigmentation. The fruit, cut into pieces and dried preferably in shade. These pieces boiled in coconut oil till the solid matter becomes like charred dust. This darkish oil is an excellent oil to prevent graying. The water in which dried amla pieces are soaked overnight is also nourishing to hair. This water should be used for the last rinse while washing the hair.\n"+"3.Washing the hair with Bengal gram flour, keeps them clean, soft and free from hair diseases.";
						            
						       v.setText(s);
				                        
				                        break;
						            }
						            switch(item)
						            { 
						            case 20:
						            	s="Home remedies for head ache \n"+"To relieve headache pain, dab a drop or two of thyme or rosemary essential oil on each temple and on your forehead. Rub gently into the skin, then sit quietly for several minutes to let this home remedy work.\n"+"Ginger may work against migraines by inhibiting prostaglandin synthesis. What’s more, ginger helps quell the nausea that often accompanies migraines. Create a homemade tea by gently.";
						            	v.setText(s);
				                        
				                        break;
						            }
						            switch(item)
						            { 
						            case 21:
						            	s="1. Lemons\n"
+"Lemons help keep blood vessels soft and pliable and by removing any rigidity, high blood pressure will be reduced. In addition, you can help lower your chance of heart failure by consuming lemon juice regularly, due to its vitamin C content. Vitamin C is an antioxidant that helps neutralize the harmful effects of free radicals.\n"
						            			+"2.Banana\n"
+"Bananas are one fruit that people with high blood pressure can eat regularly to control it. Bananas are a rich source of potassium, which lessens the effect of sodium.So, try to eat one or two bananas daily. Along with bananas, you can try dried apricots, raisins, currants, orange juice, spinach, zucchini, baked sweet potatoes, cantaloupe, and winter squash.";
						            	v.setText(s);
				                        
				                        break;
						            }
						            switch(item)
						            { 
						            case 22:
						            	s="1.Honey is a beneficial remedy for this  diseases , taking one tea spoonful honey, daily once, gives the effective relief in few days.\n"
+"2.Put some Jam fruits in the jug water mixed with salts at least for a week , to use at least three fruits daily in empty stomach for a couple weeks. The patient will get relief from the disease.\n"
+"3.The herb rawwakfia is very beneficial in this disease . The powdered root of this herb is to be mixed in a cup filled with milk and should be daily in the morning time till a complete cure.\n"
+"4.To adopt an all fruit diet for two to three weeks continuously.\n"
+"5.To use very much the juicy fruits like pineapples. Apples grapes. Oranges, Papayas, etc instead of meals.\n"
+"6.A diet of milk may be followed proportionally with all fruit after consulting with the expert doctors.";
						            	v.setText(s);
				                        
				                        break;
						            }
						            switch(item)
						            { 
						            case 23:
						            	s="• Insomnia can be treated following the same routine i.e. try to sleep at a fixed time every night and wake up at a fixed time in the morning. This would set a sleeping schedule.\n"+"• Take a ripe banana and mash it. Add roasted cumin seeds to it and mix properly. Consume this mashed mix before going to sleep.\n"
+"• Extract fresh juice of valerian wallichi. Intake 1 tsp of this every night before going to sleep.\n"
+"• Do regular exercise or partake in some physical activities everyday. This would /solve the problem of insomnia. Walking, jogging, skipping and swimming are the good exercises for treating insomnia.";
						            	v.setText(s);
				                        
				                        break;
						            };
						            switch(item)
						            { 
						            case 24:
						            	s="Home remedies are effective for the normalize of low blood pressure.Raw Beet is one of the most effective of these remedies. A cup of juice twice is a day is very effective.The Indian Spikenard  is another effective home remedy for low blood pressure.A dose of 40 grains with the addition of little camphor and cinnamon is very useful. It can also be taken as an infusion in doses of 30 to 60 grams,thrice a day.";
						            	v.setText(s);
				                        
				                        break;
						            }
						            switch(item)
						            { 
						            case 25:
						            	s="Excessive Menstrual Bleeding Treatment with Coriander Seeds(Dhaniya):\n"+
"1. Boil 6 gm of coriander seeds in half liter water till the water is reduced to half. Drink it warm.\n"
+"2. Natural Cure for Menstrual Cramps with Marigold:\n"
+"An infusion of marigold flower should be given in doses of one tablespoon twice daily. The herb is very beneficial in relieving the pain caused by menses.";						            			
						            	v.setText(s);
				                        
				                        break;
						            }
						            switch(item)
						            { 
						            case 26:
						            	s="Health tips for the prevention of osteoporisis:\n"+
"The natural sources are soyabeans, flaxseeds,whole pulses,sesame seeds.Consume more green vegetables.Taking maganesium supplementation reduces bone loss and increases bone density.";
						            	v.setText(s);
				                        
				                        break;
						            }
						            switch(item)
						            { 
						            case 27:
						            	s="1.Aniseed is a medicinal food that clears mucus.\n"
						            	+"2.Hot chilli pepper is the best mucokinetic food among all hot spicy food .When you use hot food it is better.\n"
						            	+"3.Clove possesses mucus-clearing property.It is thus an effective remedy respiratory disorders like asthma and bronchitis. A teaspoon of decoction prepared by boiling 6 cloves in 30 ml of water,makes an excellent expectorant medicine.It should be taken with honey three times daily for treating these diseases.\n"
						            	+"4.Mint is valuable in respiratory disorders like tuberculosis,asthma ,and bronchitis. a teaspoon of fresh mint juice,mixed with two teaspoon of pure malt vinegar and equal quatity of honey stirred in 120 ml of carrot juice can be given thrice daily as medicated tonic during the treatment of these diseases.";
						            	v.setText(s);
				                        
				                        break;
						            }
						            switch(item)
						            { 
						            case 28:
						            	s="Natural Herbs To over come stress\n" 

+"Green tea is very useful to over come stress and anxiety\n."

+"Charmomile Is  another herb that useful to over come stress.\n"

+"Ginseng is a ancient Chinese herb can equip your body to deal with both physical and mental stress better.";
						            	v.setText(s);
				                        
				                        break;
						            }
						            switch(item)
						            { 
						            case 29:
						            	s="Natural and simple ways to lose weight\n"

+"Drinking hot water helps to lose weight.\n" 

+"Avoid eating fat and fast foods. Avoid eating full at a time, try to eat in intervals which will help us to reduce weight.\n"

+"Avoid dairy products expect butter milk if your overweight. It is essential that body should get enough nutrients so don’t reduce this completely.\n"
+"Taking 10 gms of Ginger daily will help us to reduce over weight\n."

+"Drinking hot water before meals will help us to reduce weight\n"

+"Exercise every day a minimum of forty minutes will help to lose weight.";
						            	v.setText(s);
				                        
				                        break;
						            }
						            
						           
						            levelDialog.dismiss();    
						            }
						        });
						        levelDialog = builder.create();
						        levelDialog.show();


							
						}
					});
	

}
}
