package fr.istic.m2.idm.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.istic.m2.idm.xtext.services.TopanlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTopanlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Geometry'", "'{'", "'nDim'", "'='", "'isCircular'", "'dimensions'", "'('", "','", "')'", "'neighbors'", "'}'", "'Integer'", "'Bool'"
    };
    public static final int RULE_ID=4;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalTopanlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTopanlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTopanlParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g"; }



     	private TopanlGrammarAccess grammarAccess;
     	
        public InternalTopanlParser(TokenStream input, TopanlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Geometry";	
       	}
       	
       	@Override
       	protected TopanlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleGeometry"
    // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:67:1: entryRuleGeometry returns [EObject current=null] : iv_ruleGeometry= ruleGeometry EOF ;
    public final EObject entryRuleGeometry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeometry = null;


        try {
            // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:68:2: (iv_ruleGeometry= ruleGeometry EOF )
            // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:69:2: iv_ruleGeometry= ruleGeometry EOF
            {
             newCompositeNode(grammarAccess.getGeometryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGeometry_in_entryRuleGeometry75);
            iv_ruleGeometry=ruleGeometry();

            state._fsp--;

             current =iv_ruleGeometry; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGeometry85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeometry"


    // $ANTLR start "ruleGeometry"
    // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:76:1: ruleGeometry returns [EObject current=null] : (otherlv_0= 'Geometry' otherlv_1= '{' (otherlv_2= 'nDim' otherlv_3= '=' ( (lv_nDim_4_0= ruleInteger ) ) )? (otherlv_5= 'isCircular' otherlv_6= '=' ( (lv_isCircular_7_0= ruleBool ) ) )? otherlv_8= 'dimensions' otherlv_9= '=' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')' (otherlv_15= 'neighbors' otherlv_16= '=' otherlv_17= '(' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ')' )? otherlv_22= '}' ) ;
    public final EObject ruleGeometry() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_nDim_4_0 = null;

        AntlrDatatypeRuleToken lv_isCircular_7_0 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:79:28: ( (otherlv_0= 'Geometry' otherlv_1= '{' (otherlv_2= 'nDim' otherlv_3= '=' ( (lv_nDim_4_0= ruleInteger ) ) )? (otherlv_5= 'isCircular' otherlv_6= '=' ( (lv_isCircular_7_0= ruleBool ) ) )? otherlv_8= 'dimensions' otherlv_9= '=' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')' (otherlv_15= 'neighbors' otherlv_16= '=' otherlv_17= '(' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ')' )? otherlv_22= '}' ) )
            // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:80:1: (otherlv_0= 'Geometry' otherlv_1= '{' (otherlv_2= 'nDim' otherlv_3= '=' ( (lv_nDim_4_0= ruleInteger ) ) )? (otherlv_5= 'isCircular' otherlv_6= '=' ( (lv_isCircular_7_0= ruleBool ) ) )? otherlv_8= 'dimensions' otherlv_9= '=' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')' (otherlv_15= 'neighbors' otherlv_16= '=' otherlv_17= '(' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ')' )? otherlv_22= '}' )
            {
            // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:80:1: (otherlv_0= 'Geometry' otherlv_1= '{' (otherlv_2= 'nDim' otherlv_3= '=' ( (lv_nDim_4_0= ruleInteger ) ) )? (otherlv_5= 'isCircular' otherlv_6= '=' ( (lv_isCircular_7_0= ruleBool ) ) )? otherlv_8= 'dimensions' otherlv_9= '=' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')' (otherlv_15= 'neighbors' otherlv_16= '=' otherlv_17= '(' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ')' )? otherlv_22= '}' )
            // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:80:3: otherlv_0= 'Geometry' otherlv_1= '{' (otherlv_2= 'nDim' otherlv_3= '=' ( (lv_nDim_4_0= ruleInteger ) ) )? (otherlv_5= 'isCircular' otherlv_6= '=' ( (lv_isCircular_7_0= ruleBool ) ) )? otherlv_8= 'dimensions' otherlv_9= '=' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')' (otherlv_15= 'neighbors' otherlv_16= '=' otherlv_17= '(' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ')' )? otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleGeometry122); 

                	newLeafNode(otherlv_0, grammarAccess.getGeometryAccess().getGeometryKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleGeometry134); 

                	newLeafNode(otherlv_1, grammarAccess.getGeometryAccess().getLeftCurlyBracketKeyword_1());
                
            // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:88:1: (otherlv_2= 'nDim' otherlv_3= '=' ( (lv_nDim_4_0= ruleInteger ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:88:3: otherlv_2= 'nDim' otherlv_3= '=' ( (lv_nDim_4_0= ruleInteger ) )
                    {
                    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleGeometry147); 

                        	newLeafNode(otherlv_2, grammarAccess.getGeometryAccess().getNDimKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleGeometry159); 

                        	newLeafNode(otherlv_3, grammarAccess.getGeometryAccess().getEqualsSignKeyword_2_1());
                        
                    // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:96:1: ( (lv_nDim_4_0= ruleInteger ) )
                    // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:97:1: (lv_nDim_4_0= ruleInteger )
                    {
                    // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:97:1: (lv_nDim_4_0= ruleInteger )
                    // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:98:3: lv_nDim_4_0= ruleInteger
                    {
                     
                    	        newCompositeNode(grammarAccess.getGeometryAccess().getNDimIntegerParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInteger_in_ruleGeometry180);
                    lv_nDim_4_0=ruleInteger();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGeometryRule());
                    	        }
                           		set(
                           			current, 
                           			"nDim",
                            		lv_nDim_4_0, 
                            		"Integer");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:114:4: (otherlv_5= 'isCircular' otherlv_6= '=' ( (lv_isCircular_7_0= ruleBool ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:114:6: otherlv_5= 'isCircular' otherlv_6= '=' ( (lv_isCircular_7_0= ruleBool ) )
                    {
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleGeometry195); 

                        	newLeafNode(otherlv_5, grammarAccess.getGeometryAccess().getIsCircularKeyword_3_0());
                        
                    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleGeometry207); 

                        	newLeafNode(otherlv_6, grammarAccess.getGeometryAccess().getEqualsSignKeyword_3_1());
                        
                    // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:122:1: ( (lv_isCircular_7_0= ruleBool ) )
                    // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:123:1: (lv_isCircular_7_0= ruleBool )
                    {
                    // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:123:1: (lv_isCircular_7_0= ruleBool )
                    // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:124:3: lv_isCircular_7_0= ruleBool
                    {
                     
                    	        newCompositeNode(grammarAccess.getGeometryAccess().getIsCircularBoolParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBool_in_ruleGeometry228);
                    lv_isCircular_7_0=ruleBool();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGeometryRule());
                    	        }
                           		set(
                           			current, 
                           			"isCircular",
                            		lv_isCircular_7_0, 
                            		"Bool");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleGeometry242); 

                	newLeafNode(otherlv_8, grammarAccess.getGeometryAccess().getDimensionsKeyword_4());
                
            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleGeometry254); 

                	newLeafNode(otherlv_9, grammarAccess.getGeometryAccess().getEqualsSignKeyword_5());
                
            otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleGeometry266); 

                	newLeafNode(otherlv_10, grammarAccess.getGeometryAccess().getLeftParenthesisKeyword_6());
                
            // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:152:1: ( (otherlv_11= RULE_ID ) )
            // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:153:1: (otherlv_11= RULE_ID )
            {
            // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:153:1: (otherlv_11= RULE_ID )
            // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:154:3: otherlv_11= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGeometryRule());
            	        }
                    
            otherlv_11=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGeometry286); 

            		newLeafNode(otherlv_11, grammarAccess.getGeometryAccess().getDimensionsDimensionCrossReference_7_0()); 
            	

            }


            }

            // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:165:2: (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:165:4: otherlv_12= ',' ( (otherlv_13= RULE_ID ) )
            	    {
            	    otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleGeometry299); 

            	        	newLeafNode(otherlv_12, grammarAccess.getGeometryAccess().getCommaKeyword_8_0());
            	        
            	    // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:169:1: ( (otherlv_13= RULE_ID ) )
            	    // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:170:1: (otherlv_13= RULE_ID )
            	    {
            	    // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:170:1: (otherlv_13= RULE_ID )
            	    // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:171:3: otherlv_13= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGeometryRule());
            	    	        }
            	            
            	    otherlv_13=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGeometry319); 

            	    		newLeafNode(otherlv_13, grammarAccess.getGeometryAccess().getDimensionsDimensionCrossReference_8_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_14=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleGeometry333); 

                	newLeafNode(otherlv_14, grammarAccess.getGeometryAccess().getRightParenthesisKeyword_9());
                
            // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:186:1: (otherlv_15= 'neighbors' otherlv_16= '=' otherlv_17= '(' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:186:3: otherlv_15= 'neighbors' otherlv_16= '=' otherlv_17= '(' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ')'
                    {
                    otherlv_15=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleGeometry346); 

                        	newLeafNode(otherlv_15, grammarAccess.getGeometryAccess().getNeighborsKeyword_10_0());
                        
                    otherlv_16=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleGeometry358); 

                        	newLeafNode(otherlv_16, grammarAccess.getGeometryAccess().getEqualsSignKeyword_10_1());
                        
                    otherlv_17=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleGeometry370); 

                        	newLeafNode(otherlv_17, grammarAccess.getGeometryAccess().getLeftParenthesisKeyword_10_2());
                        
                    // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:198:1: ( (otherlv_18= RULE_ID ) )
                    // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:199:1: (otherlv_18= RULE_ID )
                    {
                    // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:199:1: (otherlv_18= RULE_ID )
                    // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:200:3: otherlv_18= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getGeometryRule());
                    	        }
                            
                    otherlv_18=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGeometry390); 

                    		newLeafNode(otherlv_18, grammarAccess.getGeometryAccess().getNeighborsNeighborCrossReference_10_3_0()); 
                    	

                    }


                    }

                    // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:211:2: (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==18) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:211:4: otherlv_19= ',' ( (otherlv_20= RULE_ID ) )
                    	    {
                    	    otherlv_19=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleGeometry403); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getGeometryAccess().getCommaKeyword_10_4_0());
                    	        
                    	    // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:215:1: ( (otherlv_20= RULE_ID ) )
                    	    // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:216:1: (otherlv_20= RULE_ID )
                    	    {
                    	    // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:216:1: (otherlv_20= RULE_ID )
                    	    // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:217:3: otherlv_20= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getGeometryRule());
                    	    	        }
                    	            
                    	    otherlv_20=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGeometry423); 

                    	    		newLeafNode(otherlv_20, grammarAccess.getGeometryAccess().getNeighborsNeighborCrossReference_10_4_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleGeometry437); 

                        	newLeafNode(otherlv_21, grammarAccess.getGeometryAccess().getRightParenthesisKeyword_10_5());
                        

                    }
                    break;

            }

            otherlv_22=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleGeometry451); 

                	newLeafNode(otherlv_22, grammarAccess.getGeometryAccess().getRightCurlyBracketKeyword_11());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeometry"


    // $ANTLR start "entryRuleInteger"
    // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:248:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:249:2: (iv_ruleInteger= ruleInteger EOF )
            // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:250:2: iv_ruleInteger= ruleInteger EOF
            {
             newCompositeNode(grammarAccess.getIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_entryRuleInteger492);
            iv_ruleInteger=ruleInteger();

            state._fsp--;

             current =iv_ruleInteger.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInteger503); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:257:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Integer' ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:260:28: (kw= 'Integer' )
            // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:262:2: kw= 'Integer'
            {
            kw=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleInteger540); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getIntegerAccess().getIntegerKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleBool"
    // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:275:1: entryRuleBool returns [String current=null] : iv_ruleBool= ruleBool EOF ;
    public final String entryRuleBool() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBool = null;


        try {
            // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:276:2: (iv_ruleBool= ruleBool EOF )
            // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:277:2: iv_ruleBool= ruleBool EOF
            {
             newCompositeNode(grammarAccess.getBoolRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBool_in_entryRuleBool580);
            iv_ruleBool=ruleBool();

            state._fsp--;

             current =iv_ruleBool.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBool591); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBool"


    // $ANTLR start "ruleBool"
    // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:284:1: ruleBool returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Bool' ;
    public final AntlrDatatypeRuleToken ruleBool() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:287:28: (kw= 'Bool' )
            // ../fr.istic.m2.idm.xtext/src-gen/fr/istic/m2/idm/xtext/parser/antlr/internal/InternalTopanl.g:289:2: kw= 'Bool'
            {
            kw=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleBool628); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getBoolAccess().getBoolKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBool"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleGeometry_in_entryRuleGeometry75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGeometry85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleGeometry122 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleGeometry134 = new BitSet(new long[]{0x000000000001A000L});
        public static final BitSet FOLLOW_13_in_ruleGeometry147 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleGeometry159 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_ruleInteger_in_ruleGeometry180 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleGeometry195 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleGeometry207 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleBool_in_ruleGeometry228 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleGeometry242 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleGeometry254 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleGeometry266 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGeometry286 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleGeometry299 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGeometry319 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleGeometry333 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_20_in_ruleGeometry346 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleGeometry358 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleGeometry370 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGeometry390 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleGeometry403 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGeometry423 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleGeometry437 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleGeometry451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger492 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInteger503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleInteger540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBool_in_entryRuleBool580 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBool591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleBool628 = new BitSet(new long[]{0x0000000000000002L});
    }


}