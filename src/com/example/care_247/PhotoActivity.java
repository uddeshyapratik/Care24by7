package com.example.care_247;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PhotoActivity  extends Activity{
	String k="";
	String k1="";
	int l=0;
	int l1=0;
	ImageView img;
	TextView t;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.photoactivity);
		img=(ImageView)findViewById(R.id.imageView1);
		t=(TextView)findViewById(R.id.textView1);
		Intent i= getIntent();
		k=i.getStringExtra("id");
	    l=Integer.parseInt(k);
	    switch(l)
		{
		case 0:
		setTitle("Running");
		img.setImageResource(R.drawable.runn);
		t.setText("There are many resons why you can start running. Running can help keep the heart healthy, improve mood, andstave off sickness, plus recent studies have found running is a great way to lose and maintain weight.");
		break;	
		case 1:
			setTitle("Swimming");
			img.setImageResource(R.drawable.swimm);
			t.setText("Swimming is a good all-round activity because it keeps your heart rate up but takes some of the impact stress off your body.It builds endurance, muscle strength and cardiovascular fitness. It helps maintain a healthy weight, healthy heart and lungs.It tones the muscles and builds strength.");
			break;
			
		case 2:
			setTitle("Jumping");
			img.setImageResource(R.drawable.jump);
			t.setText("Jumping recruits all the major muscles of the lower body. We're talking calves to glutes, and everything in between. Not only does jumping strengthen your muscles, it is great for your bones too. Landing quietly, makes the return to ground a workout too so channel your inner ballerina on the rebound.");
			break;
		
		case 3:
			setTitle("Aerobic Exercise");
			img.setImageResource(R.drawable.aerobic);
	        t.setText("The aerobic exercise is one of the most daily exercises. During aerobic exercise activity, you repeatedly move large muscles in your arms, legs and hips. You'll notice your body's responses quickly. You'll breathe faster and more deeply. This maximizes the amount of oxygen in your blood. Your heart will beat faster, which increases blood flow to your muscles and back to your lungs.");	
			break;
			
		case 4:
				setTitle("Cycling");
				img.setImageResource(R.drawable.cycling);
				t.setText("Cycling is one of the easiest ways to exercise. Cycling builds strength and muscle tone. It increases muscle tone. Cycling builds stamina. It also improves cardio-vascular fitness. Cycling improves heart health. Cycling reduces stress");
		     break;
		     
		case 5:
					setTitle("Water Cycling");

	           img.setImageResource(R.drawable.watercyc);
	           t.setText("The human body contains about 60% of water. Water is a natural and organic element. When you cycle in the water, you find yourself. You go back to the origin. The AQUACYCLING work-out is for your body plus your mind. Try it and you will feel blissfully energized. Not only do you shape your body in a much more efficient way than on land but you also protect your health, your bone structure, your joints, your muscles. Scientific studies shows that exercising in water provides numerous benefits to both health and body.");
	           break;
	           
	         
		case 6:
			   setTitle("Dancing");

	           img.setImageResource(R.drawable.dance);
	           t.setText("Dance not only instills grace, but it also helps you age gracefully. According to a study in The New England Journal of Medicine, dancing may boost your memory and prevent you from developing dementia as you get older. Science reveals that aerobic exercise can reverse volume loss in the hippocampus, the part of the brain that controls memory. The hippocampus naturally shrinks during late adulthood, which often leads to impaired memory and sometimes dementia.");
	              break;
             }
	
	   Intent j= getIntent();
	   k1=j.getStringExtra("id");
	   l1=Integer.parseInt(k1);	
		
		switch(l1)
		{
		case 0:
			setTitle("Mediation");
	
		img.setImageResource(R.drawable.mediation);
		t.setText("Though meditation is usually recognized as a largely spiritual practice, it also has many health benefits. The yoga and meditation techniques are being implemented in management of life threatening diseases in transformation of molecular and genetic structure in reversal of mental illnesses");
		break;
		
		case 1:
			setTitle("Asthana");

			img.setImageResource(R.drawable.asthana);
			t.setText("Ashtanga Yoga is a system of yoga which involves synchronizing the breath with that of a progressive series of postures, and it is a process which truly and completely produces that of intense internal heat as well as a profuse and purifying sweat that helps with detoxification of the muscles and organs of the body.");
			break;
		case 2:
			setTitle("Mantra Yoga");

			img.setImageResource(R.drawable.mantra);
			t.setText("By combining sound, breath and rhythm, mantra meditation channels the flow of energy through the mind-body circuit, adjusting the chemical composition of our internal states and regulating brain-hemisphere imbalances, contributing to a natural abatement of fear and despair–emotions that underlie both of these common afflictions. By balancing the nervous system, chanting regulates the chronic stress and tension that is the norm for many people in today’s hyper-stimulated lifestyle. And by balancing the endocrine system, chanting normalizes hormone production, which balances our moods and overall sense of well-being.");
			break;
		case 3:
			setTitle("Tadasana");
			img.setImageResource(R.drawable.tadasana);
			t.setText("Tadasana is one of the most basic postures of yoga and sometimes a part of many series of exercises.It helps you learn to maintain balance through a higher degree of control of your own body.It also helps you tone, strengthen and stretch your knees, back, arms, thighs. It also works on your core stomach muscles");
			break;
			
			case 4:
				setTitle("Anjaneyasana");
				img.setImageResource(R.drawable.anjaneyasana);
				t.setText("Anjaneyasana releases tension in your hips. It stretches your hamstrings, quads, and groin, strengthens your knees. It also helps to build mental focus.");
				break;
				
			case 5:
				setTitle("Natarajasana");
				img.setImageResource(R.drawable.natarajasana);
				t.setText("Natarajasana is the dance pose of LOrd Shiva. This pose can stretch the thighs, the groin and the abdomen.The lord of the dance pose also stretches the shoulders, chest and legs, and moves all the way to the ankles. It improves posture and balance.The pose also strengthens legs and ankles.");
				break;
				case 6:
					setTitle("Bhakti Yoga");

					img.setImageResource(R.drawable.bhakti);
					t.setText("Bhakti Yoga(Devotional Yoga) is the most divine and spiritual form of Yoga.It emphasizes on curbing our constant desires and pleasures, which we are relentlessly seeking as human beings, be it the rat-race to become rich and famous or scoring points amid the opposite sex. However, Bhakti Yoga revolves around the philosophy of complete submission to God in the form of physical, mental and emotional devotion.");
					break;
					
					case 7:
						setTitle("Vinyasa Yoga");

						img.setImageResource(R.drawable.vinyasa);
						t.setText("Vinyasa is a flowing style of yoga that links the breath with movement. The focus is on the inhale and exhale as you move from one pose to the next. Many vinyasa flow classes are done in a heated studio that can reach 80 to 85 degrees. Vinyasa yoga offers benefits to the body and mind.");
						break;
					case 8:
						setTitle("Anusara Yoga");

						img.setImageResource(R.drawable.anusra);
						t.setText("Anusara yoga shows you poses that allow your heart to open. You have the opportunity to express yourself and your inner feelings, which tend to lay hidden. Anusara yoga has also been linked to a healthier lifestyle and you may not become ill as easily. It provides flexibility to your body which helps stretch out the ligaments, tendons and muscles which help your overall posture.");
						break;
						case 9:
							setTitle("Kundalini Yoga");
							img.setImageResource(R.drawable.yoga);
							t.setText("Kundalini Yoga as taught by Yogi Bhajan is the Yoga of Awareness. It is the householder’s yoga—for people who are active in the world. Most other systems of yoga were developed by those living the renunciate life. Kundalini Yoga gives you tools to expedite your spiritual growth and healing.");
							break;
							
							case 10:
								setTitle("Ardha Chandrasana");
								img.setImageResource(R.drawable.ardha_chndrasana);
								t.setText("Ardha Chandrasana is strengthens your legs, ankles, abdomen, buttocks and spine, stretches your groins, hamstrings, calves, shoulders, and spine, opens your hips and chest, builds coordination and balance, improves digestion, aids in stress relief, therapeutic for anxiety, fatigue, menstrual pain, backache, fertility, sciatica, osteoporosis, indigestion, gastritis and constipation.");
								break;
							case 11:
								setTitle("Balasana");
								img.setImageResource(R.drawable.balasana);
								t.setText("Breath control is a significant element of balasana(Child pose). Since breathing is usually an involuntary action, not a conscious choice, Balasana allows us an opportunity to breathe fully into the back of the torso. Imagine your spine lengthening and widening with each inhalation. As you exhale, fall deeper into relaxation, allowing the stretch to release a little more tension with each breath. Focus on your breathing to help increase concentration and shut out distractions.");
								break;
								case 12:
									setTitle("Bridge Pose");
									img.setImageResource(R.drawable.bridge);
									t.setText("Bridge pose stretches the chest, neck, spine, and hips, strengthens the back, buttocks, and hamstrings, improves circulation of blood, helps alleviate stress and mild depression, calms the brain and central nervous system, stimulates the lungs, thyroid glands, and abdominal organs, improves digestion.");
									break;
									
									case 13:
										setTitle("Dolphin Pose");
										img.setImageResource(R.drawable.dolphin);
										t.setText("Dophin pose stretches your hamstrings, calves, and arches, opens your shoulders, chest, and inner armpits, strengthens your arms and legs, helps regulate digestion, tones your core muscles, therapeutic for menopause, asthma, high blood pressure, flat feet, and sciatica.");
										break;
									case 14:
										setTitle("Garudasana");
										img.setImageResource(R.drawable.gaudasana);
										t.setText("Eagle pose also known as garudasana improves your balance and stretches your upper back, shoulders and outer thighs. Regularly practicing this pose will strengthen your legs, knees and ankles. This pose opens the pelvic area and creates space between shoulder blades. Your spine should be erect and hips and shoulder face forward. Breathing evenly and gazing at a distance of about 4 or 5 feet away will help you in maintaining balance.");
										break;
									case 15:
										setTitle("High Lunge");
										img.setImageResource(R.drawable.high_lunge);
										t.setText("High lunge pose opens your groins and hips, stretches and tones your legs, especially thighs, strengthens your knees, ankles and waist, stimulates abdominals organs, increases stamina and lung capacity, lengthens the spine, thereby stretching the chest, therapeutic for indigestion, constipation, sciatica");
										break;
										
										case 16:
											setTitle("Malasana");
											img.setImageResource(R.drawable.malasana);
											t.setText("Malasana pose opens your hips and groin, stretches your ankles, lower hamstrings, back and neck, tones your abdominals, aids in digestion, strengthens your metabolism, keeps your pelvic and hip joints healthy, ideal for prenatal yoga.");
											break;
										case 17:
											setTitle("Padangusthasana");
											img.setImageResource(R.drawable.padangusthasana);
											t.setText("Padangusthsana calms the brain and helps relieve stress, anxiety and mild, stimulates the liver and kidneys, stretches the hamstrings and calves, strengthens the thighs, improves digestion, helps relieve the symptoms of menopause, helps relieve headache and insomnia");
											break;
										case 18:
											setTitle("Parighasana");
											img.setImageResource(R.drawable.parighasana);
											t.setText("Gate pose, also known as parighasna stretches the side of the body and is very useful for toning the abdominals, improving circulation and increasing the flexibility of the spine. This pose stretches the muscles connecting to ribs, thereby increasing the capacity of the lungs for deep breathing. This can be a very good cure for asthmatics. Doing this pose by kneeling on the blanket or mat reduces the pressure on the knees.");
											break;
											case 19:
												setTitle("Parvatasana");
												img.setImageResource(R.drawable.parvottanasana);
												t.setText("Parvatasana stretches the spine. It helps practitioners below 18 years to gain some height.The stretch in this pose reduces extra fat in the back and waist. It tones the abdominal muscles and hence stimulates the inner organs in the abdominal region. It sets right respiratory disorders including asthma. As you stretch your arms straight, your triceps and biceps receive good work out. It helps to reduce back pain. It improves the ability to stay focused.");
												break;
											case 20:
												setTitle("Utkatasana");
												img.setImageResource(R.drawable.utkatasana);
												t.setText("Utkatasana strengthens the spine, calves, thighs and ankles, stretches the chest and shoulders, stimulates the heart, diaphragm and abdominal organs, helps reduce fat in the body, especially in the buttocks, helpful in conditions like arthritis and joint pain, improves functioning of the immune system.");
												break;
											case 21:
												setTitle("Utthita Trikonasana");
												img.setImageResource(R.drawable.utthila);
												
												t.setText("Utthita Trikonasana strengthens your legs, feet and ankles, stretches your hips, groins, hamstrings, calves and spine, opens your chest and shoulders, strengthens your back, neck and abdominals, stimulates your abdominal organs, aiding in digestion, therapeutic for stress, anxiety, infertility, flat feet, neck pain, osteoporosis, sciatica and symptoms of menopause, relieves backache, especially during pregnancy");
												break;
											case 22:
												setTitle("Uthita Parsvakonasana");
												img.setImageResource(R.drawable.utthitap);
												t.setText("UtthitaParsvakonasana is an excellent standing pose to perform at or near the beginning of your standing pose sequence. It's also a good preparation for wide-open groin poses, like BaddhaKonasana, Malasana, and Bakasana. Strengthens and stretches the legs, knees, and ankles. It stretches the groins, spine, waist, chest and lungs, and shoulders, stimulates abdominal organs and increases stamina.");
												break;
											
		}
	

		
	    

}
}