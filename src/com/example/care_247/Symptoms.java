package com.example.care_247;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Symptoms extends Activity {
	AlertDialog levelDialog;
	Button b,home;
	EditText e1;
	TextView v,v1;
	String s,s1;
	Dialog d,d1;
	TextView t,t1;
	

	AlertDialog.Builder builder;
	final CharSequence[] items = {
		    "Allergy",
		    "Anemia",
		    "Anxiety", 
		    "Appendicitis",
		    "Bladder infection",
		    "Blood clot",
		    "Brain tumor", 
		    "Breast cancer", 
		    "Cancer",
		    "Cervical cancer", 
		    "Cold",
		    "Colon cancer", 
		    "Dengue",
		    "Depression",
		    "Diabetes",
		    "Early pregnancy",
		    "Flu (influenza)",
		    "Heart attack", 
		    "Hernia", 
		    "Herpes", 
		    "High blood pressure",
		    " HIV",
		    "Hyperthermia", 
		    "Irritable bowel syndrome (IBS)",
		    "Kidney stone",
		   
		 "Leukemia",
		    "Lung cancer", 
		    "Lupus",
		    "Ovarian cancer",
		    "Pancreatic cancer",
		    "Pneumonia", 
		    "Pregnancy",
		    "Prostate cancer",
		    "Sinus infection",
		    
		    "Swine flu (H1N1 flu)", 
		    "Ulcer",
		    };
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
	
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			requestWindowFeature(Window.FEATURE_NO_TITLE);
	        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
			setContentView(R.layout.symptomss);
			t=new TextView(this);
			 d=new Dialog(this);
			 t1=new TextView(this);
			 d1=new Dialog(this);
			v=(TextView)findViewById(R.id.textView2);
			v1=(TextView)findViewById(R.id.textView3);

			 builder = new AlertDialog.Builder(this);
					b1=(Button)findViewById(R.id.button1);
					b2=(Button)findViewById(R.id.button2);
					b6=(Button)findViewById(R.id.button6);
					home=(Button)findViewById(R.id.button2);
					b1.setOnClickListener(new View.OnClickListener() {
						
						public void onClick(View arg0) {
							 builder.setTitle("Select Disease");
						        builder.setSingleChoiceItems(items, -1, new DialogInterface.OnClickListener() {
						        public void onClick(DialogInterface dialog, int item) {
						           
						            
						            switch(item)
						            {
						                case 0:
						                  s="DESCRIPTION:-Allergies are exaggerated immune responses to environmental triggers known as allergens. ";
                                         s1="SYMPTOMS:-nasal congestion,itchy and watery eyes,sneezing,stuffy or runny nose,scratchy or sore throat,throat clearing,cough from postnasal drip.";       						                       
						                  v.setText(s);
						                        v1.setText(s1);
						                        b1.setText("Allergy");
						                        break;
						                case 1:
						                	 s="DESCRIPTION:- Anemia is the condition of having less than the normal number of red blood cells or less than the normal quantity of hemoglobin in the blood. The oxygen-carrying capacity of the blood is, as a result, decreased. ";
						                	 s1="SYMPTOMS:-Feel tired or lightheaded (sometimes with faint) ,Weakness, Fatigue easily,Have decreased energy,Appear pale";
						                	 	 v.setText(s);
						                        v1.setText(s1);  
						                        b1.setText("Anemia");
						                        break;
						                case 2:
						                	 s="DESCRIPTION:-Anxiety is a feeling of apprehension and fear.   ";
						                	 s1="SYMPTOMS:-palpitations, sweating,irritability,feelings of stress.";
                                                       
						                	 b1.setText( "Anxiety");

						                	 	 v.setText(s);
						                        v1.setText(s1);  
						                        break;
						                case 3:
						                	 s="DESCRIPTION:-Abdominal pain is the main symptom of appendicitis. The pain starts out as diffuse, meaning it is difficult to localize the area of pain. Most people say the initial pain of appendicitis occurs around the middle portion of the abdomen. As the inflammation of the appendix progresses, the pain becomes localized to one area.                                  ";
						                	 
						                	 s1= "SYMPTOMS:- Abdominal Pain,Abdominal Swelling,Abdominal Tenderness,Back Pain,  Constipation,Diarrhea. ";
						                	 b1.setText("Appendicitis"); 
						                	 v.setText(s);
						                        v1.setText(s1);  
						                        break;
						                case 4:
						                	 s="DESCRIPTION:-Bladder infection is an infection of the bladder. Bladder infection is also called cystitis and is a type of urinary tract infection (UTI). The urinary tract is naturally sterile and when microbes invade it, an infection may result.  ";
						                	 s1="SYMPTOMS:-pain,discomfort,or burning when trying to urinate";
						                	 b1.setText("Bladder infection"); 
						                	 v.setText(s);
						                        v1.setText(s1);  
						                        break;
						                case 5:
						                	 s="DESCRIPTION:-Blood clotting is a normal process that prevents loss of blood. However, sometimes disorders of the clotting system or injuries cause blood clots to form when they are not needed. In this case, the clots may cause significant complications.  ";
						                	 s1="SYMPTOMS:-  Abdominal Pain,Chest Pain,Confusion,Diarrhea,Dizziness,Headache.                                                               ";
						                	 b1.setText( "Blood clot");	
						                	 v.setText(s);
						                        v1.setText(s1);  
						                        break;
						                case 6:
						                	 s="DESCRIPTION:-Brain tumour is disaese which due to tumour in our braain  ";
						                	 s1="SYMPTOMS:- headache,gait disturbances, balance problems, nausea and vomiting, memory problems ";
						                	 b1.setText("Brain tumor");	 
						                	 v.setText(s);
						                        v1.setText(s1);  
						                        break;
						                case 7:
						                	 s="DESCRIPTION:-Breast cancer does not always produce symptoms; women may have cancers that are so small they do not produce masses that can be felt or other recognizable changes in the breast.  ";
						                	 s1="SYMPTOMS:-nipple discharge, lump or mass in the breast. ";
						                	 b1.setText("Breast cancer");	 
						                	 v.setText(s);
						                        v1.setText(s1);  
						                        break;
						                case 8:
						                	 s="DESCRIPTION:-Cancer is the uncontrolled growth of abnormal cells anywhere in a body.  ";
						                	 s1="SYMPTOMS:- fatigue, weight loss, pain, skin changes, change in bowel or bladder function, unusual bleeding, persistent cough or voice change, fever, lumps, or tissue masses. ";
						                	 b1.setText("Cancer");	
						                	 v.setText(s);
						                        v1.setText(s1);  
						                        break;
						                case 9:
						                	 s="DESCRIPTION:-Cervical cancer is cancer of the entrance to the womb (uterus). Regular pelvic exams and Pap testing can detect .  ";
						                	 s1="SYMPTOMS:-Abnormal Vaginal Bleeding,Bleeding After Sexual Intercourse,Bleeding Between Periods ";
						                	 b1.setText("Cervical cancer");	 
						                	 v.setText(s);
						                        v1.setText(s1);  
						                        break;
						                case 10:
						                	 s="DESCRIPTION:- common cold refers to a viral infection of the upper respiratory tract. This infection can be due to different types of viruses, so there is no one. In fact, over 200 types of viruses are known to cause the common cold. ";
						                	 s1="SYMPTOMS:-cough,stuffy or runny nose,scratchy or sore throat, sneezing";
						                	 b1.setText("Cold");	 
						                	 v.setText(s);
						                        v1.setText(s1);  
						                        break;
						                case 11:
						                	 s="DESCRIPTION:- olon cancer is a malignancy that arises from the inner lining of the colon. ";
						                	 s1="SYMPTOMS:- blood in the stool, dark-colored stool, change in bowel habits, constipation, diarrhea, or narrow stools. Abdominal pain, cramping, or bloating may occur. Nonspecific symptoms of colon cancer can include weight loss, fatigue, weakness, and shortness of breath. ";
						                	 b1.setText("Colon cancer"); 
						                	 v.setText(s);
						                        v1.setText(s1);  
						                        break;
						                case 12:
						                	 s="DESCRIPTION:-Dengue fever is contracted from the bite of a striped Aedes aegypti mosquito. Symptoms of dengue include headache  ";
						                	 s1="SYMPTOMS: abdominal pain, prolonged vomiting, and breathing problems. Bleeding tendencies, including easy bruising, nosebleeds, bleeding gums, skin hemorrhages, and even internal bleeding may occur. The disease may progress to failure of the circulatory system, leading to shock and death. -";
						                	 b1.setText("Dengue"); 	
						                	 v.setText(s);
						                        v1.setText(s1);  
						                        break;
						                case 13:
						                	 s="DESCRIPTION:- A depressive disorder is a syndrome (group of symptoms) that reflects a sad, blue mood exceeding normal sadness or grief ";
						                	 s1="SYMPTOMS:-Anxiety,   Suicidal Thoughts,Mania (Euphoria)";
						                	 b1.setText("Depression");	 
						                	 v.setText(s);
						                        v1.setText(s1);  
						                        break;
						                case 14:
						                	 s="DESCRIPTION:Diabetes is a chronic condition characterized by high levels of sugar (glucose) in the blood.   ";
						                	 s1="SYMPTOMS:- increased urination, and increased thirst. Other symptoms can include weight loss or gain, fatigue, nausea, vomiting, blurred vision, and increased susceptibility to infections. Vaginal infections in women and yeast infections in both men and women are common. ";
						                	 b1.setText("Diabetes");	 
						                	 v.setText(s);
						                        v1.setText(s1);  
						                        break;
						                case 15:
						                	 s="DESCRIPTION:-Symptoms of pregnancy can vary among different women. They may vary in quality or severity, and even the same woman may not experience the same symptoms in every pregnancy.  ";
						                	 s1="SYMPTOMS:-menstruation and weight gain, headaches, low backache, breast tenderness, fatigue, nausea. ";
						                	 	 v.setText(s);
						                	 	b1.setText("Early pregnancy");
						                        v1.setText(s1);  
						                        break;
						                case 16:
						                	 s="DESCRIPTION:-Influenza viruses cause the flu (influenza), a viral disease of the respiratory tract.  ";
						                	 s1="SYMPTOMS:-  Fever,Chills,Fatigue.";
						                	 	 v.setText(s);
						                	 	b1.setText("Flu (influenza)");
						                        v1.setText(s1);  
						                        break;
						                case 17:
						                	 s="DESCRIPTION:-A heart attack results when a blood clot completely obstructs a coronary artery supplying blood to the heart muscle and heart muscle dies.  ";
						                	 s1="SYMPTOMS:-cholesterol , chest pain.heart failure .";
						                	 b1.setText("Heart attack");	 
						                	 v.setText(s);
						                        v1.setText(s1);  
						                        break;
						                case 18:
						                	 s="DESCRIPTION:- A hernia is the protrusion of an organ or piece of tissue from its normally contained space. In the abdomen, a hernia usually involves a piece of bowel, or omentum, which is a fatty apron that hangs down from the midportion of the colon (large intestine), protruding through a weak area in the abdominal wall. ";
						                	 s1="SYMPTOMS:-abnormal bulging in the belly button";
						                	 b1.setText("Hernia");	
						                	 v.setText(s);
						                        v1.setText(s1);  
						                        break;
						                case 19:
						                	 s="DESCRIPTION:-Herpes viruses typically infect the oral or genital mucosa. Most oral herpes virus infections are due to the virus known as HSV-1, while genital herpes virus infections are most often caused by HSV-2. However, both kinds of herpes virus can infect any location in the body.  ";
						                	 s1="SYMPTOMS:-Blisters,Rash,Swollen Lymph Nodes";
						                	 b1.setText("Herpes");	 
						                	 v.setText(s);
						                        v1.setText(s1);  
						                        break;
						                case 20:
						                	 s="DESCRIPTION:-High blood pressure or hypertension means high pressure (tension) in the arteries. Arteries are vessels that carry blood from the pumping heart to all the tissues and organs of the body. High blood pressure does not mean excessive emotional tension, although emotional tension and stress can temporarily increase blood pressure. Normal blood pressure is below 120/80; blood pressure between 120/80 and 139/89 is called  and a blood pressure of 140/90 or above is considered high.  ";
						                	 s1="SYMPTOMS:- The human immunodeficiency virus (HIV) causes HIV infection and the acquired immunodeficiency syndrome (AIDS).";
						                	 b1.setText("High blood pressure"); 
						                	 v.setText(s);
						                        v1.setText(s1);  
						                        break;
						                case 21:
						                	 s="DESCRIPTION:-The human immunodeficiency virus (HIV) causes HIV infection and the acquired immunodeficiency syndrome (AIDS).  ";
						                	 s1="SYMPTOMS: fever, swollen lymph nodes, joint and muscle aches, and sore throat. Other symptoms can include chills, night sweats, and mouth ulcers.-";
						                	 b1.setText("HIV");	 
						                	 v.setText(s);
						                        v1.setText(s1);  
						                        break;
						                case 22:
						                	 s="DESCRIPTION:-Hyperthermia is the overheating of the body. Heat-related illnesses like heat stroke, heat exhaustion, heat cramps.  ";
						                	 s1="SYMPTOMS:- heat-related illness, muscle cramps, fatigue, dizziness, headache, nausea, vomiting, and weakness. ";
						                	 b1.setText("Hyperthermia");	
						                	 v.setText(s);
						                        v1.setText(s1);  
						                        break;
						                case 23:
						                	 s="DESCRIPTION:- Irritable bowel syndrome (IBS) is a GI (gastrointestinal disorder) with symptoms of abdominal pain, bloating, increased flatus ";
						                	 s1="SYMPTOMS:- Diarrhea,Abdominal, PainConstipation.";
						                	 b1.setText("Irritable bowel syndrome (IBS)");	 
						                	 v.setText(s);
						                        v1.setText(s1);  
						                        break;
						                case 24:
						                	 s="DESCRIPTION:- Kidney stones are solid masses of crystalline material that form in the kidneys ";
						                	 s1="SYMPTOMS:-Back Pain,Abdominal Pain, Vomiting";
						                	 b1.setText("Kidney stone");		
						                	 v.setText(s);
						                        v1.setText(s1);  
						                        break;
						                case 25:
						                	 s="DESCRIPTION:=Leukemia is actually a group of different cancers of the blood cells. Leukemias can be acute or chronic, and people with chronic leukemias may not notice any symptoms before the condition is diagnosed with a blood test. Acute leukemias are more likely to cause symptoms.   ";
						                	 s1="SYMPTOMS:- fevers, night sweats, and swollen lymph nodes that are typically not painful or tender. Fatigue, weight loss, and bone or joint pain are other potential symptoms. Easy bruising and bleeding tendencies may result in bleeding from the gums, purplish patches on the skin, or small red spots under the skin. ";
						                	 b1.setText("Leukemia");	
						                	 v.setText(s);
						                        v1.setText(s1);  
						                        break;
						                case 26:
						                	 s="DESCRIPTION:-Lung cancer kills more men and women than any other form of cancer. Eight out of 10 lung cancers are due to tobacco smoke.In up to 25% of people who get lung cancer, there are no apparent symptoms at the time of diagnosis.  ";
						                	 s1="SYMPTOMS:-Common symptoms include cough, shortness of breath, wheezing, chest pain, and coughing up blood. Other symptoms can include shoulder pain, hoarseness, or difficulty swallowing. Symptoms of metastatic disease can include headaches, vision changes, seizures, weakness, or symptoms of stroke.  ";
						                	 b1.setText("Lung cancer"); 
						                	 	 v.setText(s);
						                        v1.setText(s1);  
						                        break;
						                case 27:
						                	 s="DESCRIPTION:-Lupus is an autoimmune disease characterized by acute and chronic inflammation of various tissues of the body. Autoimmune diseases are illnesses that occur when the body's tissues are attacked by its own immune system. The immune system is a complex system within the body that is designed to fight infectious agents, such as bacteria and other foreign microbes.   ";
						                	 s1="SYMPTOMS:-Chest Pain,Coma,Easy Bruising,Fatigue,Frequent Infections,Hair Loss,High Blood Pressure,Joint Pains,Loss of Appetite,Mouth Ulcers,Muscle Aches,Rash";
						                	 b1.setText("Lupus");	 
						                	 v.setText(s);
						                        v1.setText(s1);  
						                        break;
						                case 28:
						                	 s="DESCRIPTION:- ovarian cancer that come from within the ovary itself, including germ cell tumors and sex cord-stromal tumors. Most commonly, tumors arise from the epithelium, or lining cells, of the ovary.  ";
						                	 s1="SYMPTOMS:Ovarian cancer may not cause any specific symptoms, particularly in its early stages.Symptoms can include abdominal enlargement or swelling, abdominal fullness, early satiety (feeling full early), changes in bowel or bladder habits, or clothes not fitting well. -";
						                	 b1.setText("Ovarian cancer");	 
						                	 v.setText(s);
						                        v1.setText(s1);  
						                        break;
						                case 29: 
						                	    s="DESCRIPTION:-Pancreatic cancer is difficult to diagnose, and the diagnosis is often made late in the course of the disease. Symptoms of pancreatic cancer in its late stage include weight loss and back pain. In some cases, painless jaundice may be a symptom of early, operable pancreatic cancer.  ";
						                	    s1="SYMPTOMS:-Pancreatic cancer typically does not cause symptoms until it has grown, so it is most frequently diagnosed in advanced stages rather than early in the course of the disease. In some cases, jaundice (a yellowish discoloration of the skin and whites of the eyes) without pain can be an early sign of pancreatic cancer. Other symptoms that can occur with more advanced disease are nausea, vomiting, weight loss, itching skin, and decreased appetite. ";
						                	    b1.setText("Pancreatic cancer"); 
						                	    v.setText(s);
						                        v1.setText(s1);  
						                        break;
						                case 30:
						                	 s="DESCRIPTION:-Pneumonia is inflammation of the airspaces in the lungs, most commonly due to an infection.Pneumonia may be caused by viruses, bacteria, or fungi. ";
						                	 s1="SYMPTOMS:-Pneumonia often starts with symptoms typical of a cold or upper respiratory infection, like sore throat, nasal congestion, and cough. As the infection develops in the lung, high fever is apparent along with chills and a cough that produces thick sputum";
						                	 b1.setText("Pneumonia");	 
						                	 v.setText(s);
						                        v1.setText(s1);  
						                        break;
						                case 31:
						                	 s="DESCRIPTION:-Particularly in the early stages, symptoms of pregnancy can vary among women. And while the absence of menstrual periods is the classic and hallmark pregnancy symptoms, there are many other changes in the body, even during early pregnancy that result in characteristic signs and symptoms. ";
						                	 s1="SYMPTOMS:- Common symptoms can include breast swelling and tenderness. Food cravings, while typical of later pregnancy stages, can also begin in the early weeks of pregnancy. Morning sickness (nausea and/or vomiting, which can occur at any time of day and not just in the morning) usually begins in the second to eighth week of pregnancy. Tiredness, mood swings, headache, and frequent need to urinate are all symptoms that can begin early in pregnancy.";
						                	 b1.setText("Pregnancy");
						                	 v.setText(s);
						                        v1.setText(s1);  
						                        break;
						                case 32:
						                	 s="DESCRIPTION:-Prostate cancer is common in men over 50, especially in African-Americans and in men who eat fatty food and/or have a father or brother with prostate cancer";
						                	 s1="SYMPTOMS-Symptoms of prostate problems (and prostate cancer) include urinary problems (little or no urine output, difficulty starting (straining) or stopping the urine stream, frequent urination, dribbling, pain or burning during urination), erectile dysfunction, painful ejaculation, blood in urine or semen and/or deep back, hip, pelvic or abdominal pain; other symptoms may include weight loss, bone pain and lower extremity swelling.";
						                	 b1.setText("Prostate cancer"); 
						                	 v.setText(s);
						                        v1.setText(s1);  
						                        break;
						                case 33:
						                	 s="DESCRIPTION:-Sinus infection is characterized by an infection of the lining tissues of the sinuses within the skull. The resultant inflammation leads to blockage of the openings that allow drainage of fluid from the sinus.   ";
						                	 s1="SYMPTOMS:-Symptoms can include pain or pressure sensations over the involved areas of the face along with tenderness and swelling. Stuffy nose, or nasal congestion, can occur as well as drainage or discharge from the nose. Cough may be present, and sometimes patients have fever.";
						                	 b1.setText("Sinus infection");
						                	 v.setText(s);
						                        v1.setText(s1);  
						                        break;
						                case 34:
						                	 s="DESCRIPTION:-Swine flu is a respiratory disease caused by influenza viruses that infect the respiratory tract of pigs and result in a barking cough, decreased appetite, nasal secretions, and listless behavior; the virus can be transmitted to humans.  ";
						                	 s1="SYMPTOMS:-Symptoms of swine flu in humans are similar to most influenza infections: fever (100 F or greater), cough, nasal secretions, fatigue, and headache.";
						                	 b1.setText("Swine flu (H1N1 flu)");	 
						                	 v.setText(s);
						                        v1.setText(s1);  
						                        break;
						                case 35:
						                	 s="DESCRIPTION:- Peptic ulcer disease is characterized by sores, or ulcerations, in the lining tissues of the stomach or the duodenum, the first portion of the small intestine. ";
						                	 s1="SYMPTOMS:-Black Stools,Indigestion,Loss of AppetiteUpper, Abdominal Pain,Weight Loss";
						                	 b1.setText("Ulcer");	 
						                	 v.setText(s);
						                        v1.setText(s1);  
						                        break;
						              
						            }
						            levelDialog.dismiss();    
						            }
						        });
						        levelDialog = builder.create();
						        levelDialog.show();


							
						}
					});
					b6.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							t1.setText("This application contains information and symptoms about some major disease,which help the user to gain knowledge about the disease such that they consult doctors if they have suffering from the symptoms of the disease. ");
							//t.setText("hello");
							t1.setPadding(60, 60, 60, 60);
							
							
							d1.setTitle("Disclaimer");
							d1.setContentView(t1);
							d1.show();	
						}
					});
			        
b2.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							Intent ia=new Intent(Symptoms.this,Home.class);
							startActivity(ia);
						}
					});
			        
			
			
			
				
				

					}}
