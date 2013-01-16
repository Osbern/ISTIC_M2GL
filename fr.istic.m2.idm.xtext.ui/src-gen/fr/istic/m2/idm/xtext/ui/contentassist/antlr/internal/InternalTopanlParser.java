package fr.istic.m2.idm.xtext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import fr.istic.m2.idm.xtext.services.TopanlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTopanlParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Integer'", "'Bool'", "'Geometry'", "'{'", "'dimensions'", "'='", "'('", "')'", "'}'", "'nDim'", "'isCircular'", "','", "'neighbors'"
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
    public String getGrammarFileName() { return "../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g"; }


     
     	private TopanlGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(TopanlGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleGeometry"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:60:1: entryRuleGeometry : ruleGeometry EOF ;
    public final void entryRuleGeometry() throws RecognitionException {
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:61:1: ( ruleGeometry EOF )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:62:1: ruleGeometry EOF
            {
             before(grammarAccess.getGeometryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGeometry_in_entryRuleGeometry61);
            ruleGeometry();

            state._fsp--;

             after(grammarAccess.getGeometryRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGeometry68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGeometry"


    // $ANTLR start "ruleGeometry"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:69:1: ruleGeometry : ( ( rule__Geometry__Group__0 ) ) ;
    public final void ruleGeometry() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:73:2: ( ( ( rule__Geometry__Group__0 ) ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:74:1: ( ( rule__Geometry__Group__0 ) )
            {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:74:1: ( ( rule__Geometry__Group__0 ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:75:1: ( rule__Geometry__Group__0 )
            {
             before(grammarAccess.getGeometryAccess().getGroup()); 
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:76:1: ( rule__Geometry__Group__0 )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:76:2: rule__Geometry__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group__0_in_ruleGeometry94);
            rule__Geometry__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGeometryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGeometry"


    // $ANTLR start "entryRuleInteger"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:92:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:93:1: ( ruleInteger EOF )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:94:1: ruleInteger EOF
            {
             before(grammarAccess.getIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_entryRuleInteger125);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getIntegerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInteger132); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:101:1: ruleInteger : ( 'Integer' ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:105:2: ( ( 'Integer' ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:106:1: ( 'Integer' )
            {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:106:1: ( 'Integer' )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:107:1: 'Integer'
            {
             before(grammarAccess.getIntegerAccess().getIntegerKeyword()); 
            match(input,11,FollowSets000.FOLLOW_11_in_ruleInteger159); 
             after(grammarAccess.getIntegerAccess().getIntegerKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleBool"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:122:1: entryRuleBool : ruleBool EOF ;
    public final void entryRuleBool() throws RecognitionException {
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:123:1: ( ruleBool EOF )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:124:1: ruleBool EOF
            {
             before(grammarAccess.getBoolRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBool_in_entryRuleBool187);
            ruleBool();

            state._fsp--;

             after(grammarAccess.getBoolRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBool194); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBool"


    // $ANTLR start "ruleBool"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:131:1: ruleBool : ( 'Bool' ) ;
    public final void ruleBool() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:135:2: ( ( 'Bool' ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:136:1: ( 'Bool' )
            {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:136:1: ( 'Bool' )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:137:1: 'Bool'
            {
             before(grammarAccess.getBoolAccess().getBoolKeyword()); 
            match(input,12,FollowSets000.FOLLOW_12_in_ruleBool221); 
             after(grammarAccess.getBoolAccess().getBoolKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBool"


    // $ANTLR start "rule__Geometry__Group__0"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:154:1: rule__Geometry__Group__0 : rule__Geometry__Group__0__Impl rule__Geometry__Group__1 ;
    public final void rule__Geometry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:158:1: ( rule__Geometry__Group__0__Impl rule__Geometry__Group__1 )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:159:2: rule__Geometry__Group__0__Impl rule__Geometry__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group__0__Impl_in_rule__Geometry__Group__0256);
            rule__Geometry__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group__1_in_rule__Geometry__Group__0259);
            rule__Geometry__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__0"


    // $ANTLR start "rule__Geometry__Group__0__Impl"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:166:1: rule__Geometry__Group__0__Impl : ( 'Geometry' ) ;
    public final void rule__Geometry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:170:1: ( ( 'Geometry' ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:171:1: ( 'Geometry' )
            {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:171:1: ( 'Geometry' )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:172:1: 'Geometry'
            {
             before(grammarAccess.getGeometryAccess().getGeometryKeyword_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Geometry__Group__0__Impl287); 
             after(grammarAccess.getGeometryAccess().getGeometryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__0__Impl"


    // $ANTLR start "rule__Geometry__Group__1"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:185:1: rule__Geometry__Group__1 : rule__Geometry__Group__1__Impl rule__Geometry__Group__2 ;
    public final void rule__Geometry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:189:1: ( rule__Geometry__Group__1__Impl rule__Geometry__Group__2 )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:190:2: rule__Geometry__Group__1__Impl rule__Geometry__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group__1__Impl_in_rule__Geometry__Group__1318);
            rule__Geometry__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group__2_in_rule__Geometry__Group__1321);
            rule__Geometry__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__1"


    // $ANTLR start "rule__Geometry__Group__1__Impl"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:197:1: rule__Geometry__Group__1__Impl : ( '{' ) ;
    public final void rule__Geometry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:201:1: ( ( '{' ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:202:1: ( '{' )
            {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:202:1: ( '{' )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:203:1: '{'
            {
             before(grammarAccess.getGeometryAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Geometry__Group__1__Impl349); 
             after(grammarAccess.getGeometryAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__1__Impl"


    // $ANTLR start "rule__Geometry__Group__2"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:216:1: rule__Geometry__Group__2 : rule__Geometry__Group__2__Impl rule__Geometry__Group__3 ;
    public final void rule__Geometry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:220:1: ( rule__Geometry__Group__2__Impl rule__Geometry__Group__3 )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:221:2: rule__Geometry__Group__2__Impl rule__Geometry__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group__2__Impl_in_rule__Geometry__Group__2380);
            rule__Geometry__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group__3_in_rule__Geometry__Group__2383);
            rule__Geometry__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__2"


    // $ANTLR start "rule__Geometry__Group__2__Impl"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:228:1: rule__Geometry__Group__2__Impl : ( ( rule__Geometry__Group_2__0 )? ) ;
    public final void rule__Geometry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:232:1: ( ( ( rule__Geometry__Group_2__0 )? ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:233:1: ( ( rule__Geometry__Group_2__0 )? )
            {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:233:1: ( ( rule__Geometry__Group_2__0 )? )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:234:1: ( rule__Geometry__Group_2__0 )?
            {
             before(grammarAccess.getGeometryAccess().getGroup_2()); 
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:235:1: ( rule__Geometry__Group_2__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==20) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:235:2: rule__Geometry__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group_2__0_in_rule__Geometry__Group__2__Impl410);
                    rule__Geometry__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGeometryAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__2__Impl"


    // $ANTLR start "rule__Geometry__Group__3"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:245:1: rule__Geometry__Group__3 : rule__Geometry__Group__3__Impl rule__Geometry__Group__4 ;
    public final void rule__Geometry__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:249:1: ( rule__Geometry__Group__3__Impl rule__Geometry__Group__4 )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:250:2: rule__Geometry__Group__3__Impl rule__Geometry__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group__3__Impl_in_rule__Geometry__Group__3441);
            rule__Geometry__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group__4_in_rule__Geometry__Group__3444);
            rule__Geometry__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__3"


    // $ANTLR start "rule__Geometry__Group__3__Impl"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:257:1: rule__Geometry__Group__3__Impl : ( ( rule__Geometry__Group_3__0 )? ) ;
    public final void rule__Geometry__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:261:1: ( ( ( rule__Geometry__Group_3__0 )? ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:262:1: ( ( rule__Geometry__Group_3__0 )? )
            {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:262:1: ( ( rule__Geometry__Group_3__0 )? )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:263:1: ( rule__Geometry__Group_3__0 )?
            {
             before(grammarAccess.getGeometryAccess().getGroup_3()); 
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:264:1: ( rule__Geometry__Group_3__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:264:2: rule__Geometry__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group_3__0_in_rule__Geometry__Group__3__Impl471);
                    rule__Geometry__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGeometryAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__3__Impl"


    // $ANTLR start "rule__Geometry__Group__4"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:274:1: rule__Geometry__Group__4 : rule__Geometry__Group__4__Impl rule__Geometry__Group__5 ;
    public final void rule__Geometry__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:278:1: ( rule__Geometry__Group__4__Impl rule__Geometry__Group__5 )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:279:2: rule__Geometry__Group__4__Impl rule__Geometry__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group__4__Impl_in_rule__Geometry__Group__4502);
            rule__Geometry__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group__5_in_rule__Geometry__Group__4505);
            rule__Geometry__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__4"


    // $ANTLR start "rule__Geometry__Group__4__Impl"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:286:1: rule__Geometry__Group__4__Impl : ( 'dimensions' ) ;
    public final void rule__Geometry__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:290:1: ( ( 'dimensions' ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:291:1: ( 'dimensions' )
            {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:291:1: ( 'dimensions' )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:292:1: 'dimensions'
            {
             before(grammarAccess.getGeometryAccess().getDimensionsKeyword_4()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Geometry__Group__4__Impl533); 
             after(grammarAccess.getGeometryAccess().getDimensionsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__4__Impl"


    // $ANTLR start "rule__Geometry__Group__5"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:305:1: rule__Geometry__Group__5 : rule__Geometry__Group__5__Impl rule__Geometry__Group__6 ;
    public final void rule__Geometry__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:309:1: ( rule__Geometry__Group__5__Impl rule__Geometry__Group__6 )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:310:2: rule__Geometry__Group__5__Impl rule__Geometry__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group__5__Impl_in_rule__Geometry__Group__5564);
            rule__Geometry__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group__6_in_rule__Geometry__Group__5567);
            rule__Geometry__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__5"


    // $ANTLR start "rule__Geometry__Group__5__Impl"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:317:1: rule__Geometry__Group__5__Impl : ( '=' ) ;
    public final void rule__Geometry__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:321:1: ( ( '=' ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:322:1: ( '=' )
            {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:322:1: ( '=' )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:323:1: '='
            {
             before(grammarAccess.getGeometryAccess().getEqualsSignKeyword_5()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Geometry__Group__5__Impl595); 
             after(grammarAccess.getGeometryAccess().getEqualsSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__5__Impl"


    // $ANTLR start "rule__Geometry__Group__6"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:336:1: rule__Geometry__Group__6 : rule__Geometry__Group__6__Impl rule__Geometry__Group__7 ;
    public final void rule__Geometry__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:340:1: ( rule__Geometry__Group__6__Impl rule__Geometry__Group__7 )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:341:2: rule__Geometry__Group__6__Impl rule__Geometry__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group__6__Impl_in_rule__Geometry__Group__6626);
            rule__Geometry__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group__7_in_rule__Geometry__Group__6629);
            rule__Geometry__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__6"


    // $ANTLR start "rule__Geometry__Group__6__Impl"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:348:1: rule__Geometry__Group__6__Impl : ( '(' ) ;
    public final void rule__Geometry__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:352:1: ( ( '(' ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:353:1: ( '(' )
            {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:353:1: ( '(' )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:354:1: '('
            {
             before(grammarAccess.getGeometryAccess().getLeftParenthesisKeyword_6()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Geometry__Group__6__Impl657); 
             after(grammarAccess.getGeometryAccess().getLeftParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__6__Impl"


    // $ANTLR start "rule__Geometry__Group__7"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:367:1: rule__Geometry__Group__7 : rule__Geometry__Group__7__Impl rule__Geometry__Group__8 ;
    public final void rule__Geometry__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:371:1: ( rule__Geometry__Group__7__Impl rule__Geometry__Group__8 )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:372:2: rule__Geometry__Group__7__Impl rule__Geometry__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group__7__Impl_in_rule__Geometry__Group__7688);
            rule__Geometry__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group__8_in_rule__Geometry__Group__7691);
            rule__Geometry__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__7"


    // $ANTLR start "rule__Geometry__Group__7__Impl"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:379:1: rule__Geometry__Group__7__Impl : ( ( rule__Geometry__DimensionsAssignment_7 ) ) ;
    public final void rule__Geometry__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:383:1: ( ( ( rule__Geometry__DimensionsAssignment_7 ) ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:384:1: ( ( rule__Geometry__DimensionsAssignment_7 ) )
            {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:384:1: ( ( rule__Geometry__DimensionsAssignment_7 ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:385:1: ( rule__Geometry__DimensionsAssignment_7 )
            {
             before(grammarAccess.getGeometryAccess().getDimensionsAssignment_7()); 
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:386:1: ( rule__Geometry__DimensionsAssignment_7 )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:386:2: rule__Geometry__DimensionsAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Geometry__DimensionsAssignment_7_in_rule__Geometry__Group__7__Impl718);
            rule__Geometry__DimensionsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getGeometryAccess().getDimensionsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__7__Impl"


    // $ANTLR start "rule__Geometry__Group__8"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:396:1: rule__Geometry__Group__8 : rule__Geometry__Group__8__Impl rule__Geometry__Group__9 ;
    public final void rule__Geometry__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:400:1: ( rule__Geometry__Group__8__Impl rule__Geometry__Group__9 )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:401:2: rule__Geometry__Group__8__Impl rule__Geometry__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group__8__Impl_in_rule__Geometry__Group__8748);
            rule__Geometry__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group__9_in_rule__Geometry__Group__8751);
            rule__Geometry__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__8"


    // $ANTLR start "rule__Geometry__Group__8__Impl"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:408:1: rule__Geometry__Group__8__Impl : ( ( rule__Geometry__Group_8__0 )* ) ;
    public final void rule__Geometry__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:412:1: ( ( ( rule__Geometry__Group_8__0 )* ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:413:1: ( ( rule__Geometry__Group_8__0 )* )
            {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:413:1: ( ( rule__Geometry__Group_8__0 )* )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:414:1: ( rule__Geometry__Group_8__0 )*
            {
             before(grammarAccess.getGeometryAccess().getGroup_8()); 
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:415:1: ( rule__Geometry__Group_8__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:415:2: rule__Geometry__Group_8__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group_8__0_in_rule__Geometry__Group__8__Impl778);
            	    rule__Geometry__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getGeometryAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__8__Impl"


    // $ANTLR start "rule__Geometry__Group__9"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:425:1: rule__Geometry__Group__9 : rule__Geometry__Group__9__Impl rule__Geometry__Group__10 ;
    public final void rule__Geometry__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:429:1: ( rule__Geometry__Group__9__Impl rule__Geometry__Group__10 )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:430:2: rule__Geometry__Group__9__Impl rule__Geometry__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group__9__Impl_in_rule__Geometry__Group__9809);
            rule__Geometry__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group__10_in_rule__Geometry__Group__9812);
            rule__Geometry__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__9"


    // $ANTLR start "rule__Geometry__Group__9__Impl"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:437:1: rule__Geometry__Group__9__Impl : ( ')' ) ;
    public final void rule__Geometry__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:441:1: ( ( ')' ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:442:1: ( ')' )
            {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:442:1: ( ')' )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:443:1: ')'
            {
             before(grammarAccess.getGeometryAccess().getRightParenthesisKeyword_9()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Geometry__Group__9__Impl840); 
             after(grammarAccess.getGeometryAccess().getRightParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__9__Impl"


    // $ANTLR start "rule__Geometry__Group__10"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:456:1: rule__Geometry__Group__10 : rule__Geometry__Group__10__Impl rule__Geometry__Group__11 ;
    public final void rule__Geometry__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:460:1: ( rule__Geometry__Group__10__Impl rule__Geometry__Group__11 )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:461:2: rule__Geometry__Group__10__Impl rule__Geometry__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group__10__Impl_in_rule__Geometry__Group__10871);
            rule__Geometry__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group__11_in_rule__Geometry__Group__10874);
            rule__Geometry__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__10"


    // $ANTLR start "rule__Geometry__Group__10__Impl"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:468:1: rule__Geometry__Group__10__Impl : ( ( rule__Geometry__Group_10__0 )? ) ;
    public final void rule__Geometry__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:472:1: ( ( ( rule__Geometry__Group_10__0 )? ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:473:1: ( ( rule__Geometry__Group_10__0 )? )
            {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:473:1: ( ( rule__Geometry__Group_10__0 )? )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:474:1: ( rule__Geometry__Group_10__0 )?
            {
             before(grammarAccess.getGeometryAccess().getGroup_10()); 
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:475:1: ( rule__Geometry__Group_10__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:475:2: rule__Geometry__Group_10__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group_10__0_in_rule__Geometry__Group__10__Impl901);
                    rule__Geometry__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGeometryAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__10__Impl"


    // $ANTLR start "rule__Geometry__Group__11"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:485:1: rule__Geometry__Group__11 : rule__Geometry__Group__11__Impl ;
    public final void rule__Geometry__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:489:1: ( rule__Geometry__Group__11__Impl )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:490:2: rule__Geometry__Group__11__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group__11__Impl_in_rule__Geometry__Group__11932);
            rule__Geometry__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__11"


    // $ANTLR start "rule__Geometry__Group__11__Impl"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:496:1: rule__Geometry__Group__11__Impl : ( '}' ) ;
    public final void rule__Geometry__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:500:1: ( ( '}' ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:501:1: ( '}' )
            {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:501:1: ( '}' )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:502:1: '}'
            {
             before(grammarAccess.getGeometryAccess().getRightCurlyBracketKeyword_11()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Geometry__Group__11__Impl960); 
             after(grammarAccess.getGeometryAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group__11__Impl"


    // $ANTLR start "rule__Geometry__Group_2__0"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:539:1: rule__Geometry__Group_2__0 : rule__Geometry__Group_2__0__Impl rule__Geometry__Group_2__1 ;
    public final void rule__Geometry__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:543:1: ( rule__Geometry__Group_2__0__Impl rule__Geometry__Group_2__1 )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:544:2: rule__Geometry__Group_2__0__Impl rule__Geometry__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group_2__0__Impl_in_rule__Geometry__Group_2__01015);
            rule__Geometry__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group_2__1_in_rule__Geometry__Group_2__01018);
            rule__Geometry__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_2__0"


    // $ANTLR start "rule__Geometry__Group_2__0__Impl"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:551:1: rule__Geometry__Group_2__0__Impl : ( 'nDim' ) ;
    public final void rule__Geometry__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:555:1: ( ( 'nDim' ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:556:1: ( 'nDim' )
            {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:556:1: ( 'nDim' )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:557:1: 'nDim'
            {
             before(grammarAccess.getGeometryAccess().getNDimKeyword_2_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Geometry__Group_2__0__Impl1046); 
             after(grammarAccess.getGeometryAccess().getNDimKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_2__0__Impl"


    // $ANTLR start "rule__Geometry__Group_2__1"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:570:1: rule__Geometry__Group_2__1 : rule__Geometry__Group_2__1__Impl rule__Geometry__Group_2__2 ;
    public final void rule__Geometry__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:574:1: ( rule__Geometry__Group_2__1__Impl rule__Geometry__Group_2__2 )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:575:2: rule__Geometry__Group_2__1__Impl rule__Geometry__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group_2__1__Impl_in_rule__Geometry__Group_2__11077);
            rule__Geometry__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group_2__2_in_rule__Geometry__Group_2__11080);
            rule__Geometry__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_2__1"


    // $ANTLR start "rule__Geometry__Group_2__1__Impl"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:582:1: rule__Geometry__Group_2__1__Impl : ( '=' ) ;
    public final void rule__Geometry__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:586:1: ( ( '=' ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:587:1: ( '=' )
            {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:587:1: ( '=' )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:588:1: '='
            {
             before(grammarAccess.getGeometryAccess().getEqualsSignKeyword_2_1()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Geometry__Group_2__1__Impl1108); 
             after(grammarAccess.getGeometryAccess().getEqualsSignKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_2__1__Impl"


    // $ANTLR start "rule__Geometry__Group_2__2"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:601:1: rule__Geometry__Group_2__2 : rule__Geometry__Group_2__2__Impl ;
    public final void rule__Geometry__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:605:1: ( rule__Geometry__Group_2__2__Impl )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:606:2: rule__Geometry__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group_2__2__Impl_in_rule__Geometry__Group_2__21139);
            rule__Geometry__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_2__2"


    // $ANTLR start "rule__Geometry__Group_2__2__Impl"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:612:1: rule__Geometry__Group_2__2__Impl : ( ( rule__Geometry__NDimAssignment_2_2 ) ) ;
    public final void rule__Geometry__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:616:1: ( ( ( rule__Geometry__NDimAssignment_2_2 ) ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:617:1: ( ( rule__Geometry__NDimAssignment_2_2 ) )
            {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:617:1: ( ( rule__Geometry__NDimAssignment_2_2 ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:618:1: ( rule__Geometry__NDimAssignment_2_2 )
            {
             before(grammarAccess.getGeometryAccess().getNDimAssignment_2_2()); 
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:619:1: ( rule__Geometry__NDimAssignment_2_2 )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:619:2: rule__Geometry__NDimAssignment_2_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Geometry__NDimAssignment_2_2_in_rule__Geometry__Group_2__2__Impl1166);
            rule__Geometry__NDimAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getGeometryAccess().getNDimAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_2__2__Impl"


    // $ANTLR start "rule__Geometry__Group_3__0"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:635:1: rule__Geometry__Group_3__0 : rule__Geometry__Group_3__0__Impl rule__Geometry__Group_3__1 ;
    public final void rule__Geometry__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:639:1: ( rule__Geometry__Group_3__0__Impl rule__Geometry__Group_3__1 )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:640:2: rule__Geometry__Group_3__0__Impl rule__Geometry__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group_3__0__Impl_in_rule__Geometry__Group_3__01202);
            rule__Geometry__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group_3__1_in_rule__Geometry__Group_3__01205);
            rule__Geometry__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_3__0"


    // $ANTLR start "rule__Geometry__Group_3__0__Impl"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:647:1: rule__Geometry__Group_3__0__Impl : ( 'isCircular' ) ;
    public final void rule__Geometry__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:651:1: ( ( 'isCircular' ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:652:1: ( 'isCircular' )
            {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:652:1: ( 'isCircular' )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:653:1: 'isCircular'
            {
             before(grammarAccess.getGeometryAccess().getIsCircularKeyword_3_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Geometry__Group_3__0__Impl1233); 
             after(grammarAccess.getGeometryAccess().getIsCircularKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_3__0__Impl"


    // $ANTLR start "rule__Geometry__Group_3__1"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:666:1: rule__Geometry__Group_3__1 : rule__Geometry__Group_3__1__Impl rule__Geometry__Group_3__2 ;
    public final void rule__Geometry__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:670:1: ( rule__Geometry__Group_3__1__Impl rule__Geometry__Group_3__2 )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:671:2: rule__Geometry__Group_3__1__Impl rule__Geometry__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group_3__1__Impl_in_rule__Geometry__Group_3__11264);
            rule__Geometry__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group_3__2_in_rule__Geometry__Group_3__11267);
            rule__Geometry__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_3__1"


    // $ANTLR start "rule__Geometry__Group_3__1__Impl"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:678:1: rule__Geometry__Group_3__1__Impl : ( '=' ) ;
    public final void rule__Geometry__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:682:1: ( ( '=' ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:683:1: ( '=' )
            {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:683:1: ( '=' )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:684:1: '='
            {
             before(grammarAccess.getGeometryAccess().getEqualsSignKeyword_3_1()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Geometry__Group_3__1__Impl1295); 
             after(grammarAccess.getGeometryAccess().getEqualsSignKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_3__1__Impl"


    // $ANTLR start "rule__Geometry__Group_3__2"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:697:1: rule__Geometry__Group_3__2 : rule__Geometry__Group_3__2__Impl ;
    public final void rule__Geometry__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:701:1: ( rule__Geometry__Group_3__2__Impl )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:702:2: rule__Geometry__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group_3__2__Impl_in_rule__Geometry__Group_3__21326);
            rule__Geometry__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_3__2"


    // $ANTLR start "rule__Geometry__Group_3__2__Impl"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:708:1: rule__Geometry__Group_3__2__Impl : ( ( rule__Geometry__IsCircularAssignment_3_2 ) ) ;
    public final void rule__Geometry__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:712:1: ( ( ( rule__Geometry__IsCircularAssignment_3_2 ) ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:713:1: ( ( rule__Geometry__IsCircularAssignment_3_2 ) )
            {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:713:1: ( ( rule__Geometry__IsCircularAssignment_3_2 ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:714:1: ( rule__Geometry__IsCircularAssignment_3_2 )
            {
             before(grammarAccess.getGeometryAccess().getIsCircularAssignment_3_2()); 
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:715:1: ( rule__Geometry__IsCircularAssignment_3_2 )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:715:2: rule__Geometry__IsCircularAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Geometry__IsCircularAssignment_3_2_in_rule__Geometry__Group_3__2__Impl1353);
            rule__Geometry__IsCircularAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getGeometryAccess().getIsCircularAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_3__2__Impl"


    // $ANTLR start "rule__Geometry__Group_8__0"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:731:1: rule__Geometry__Group_8__0 : rule__Geometry__Group_8__0__Impl rule__Geometry__Group_8__1 ;
    public final void rule__Geometry__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:735:1: ( rule__Geometry__Group_8__0__Impl rule__Geometry__Group_8__1 )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:736:2: rule__Geometry__Group_8__0__Impl rule__Geometry__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group_8__0__Impl_in_rule__Geometry__Group_8__01389);
            rule__Geometry__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group_8__1_in_rule__Geometry__Group_8__01392);
            rule__Geometry__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_8__0"


    // $ANTLR start "rule__Geometry__Group_8__0__Impl"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:743:1: rule__Geometry__Group_8__0__Impl : ( ',' ) ;
    public final void rule__Geometry__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:747:1: ( ( ',' ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:748:1: ( ',' )
            {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:748:1: ( ',' )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:749:1: ','
            {
             before(grammarAccess.getGeometryAccess().getCommaKeyword_8_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Geometry__Group_8__0__Impl1420); 
             after(grammarAccess.getGeometryAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_8__0__Impl"


    // $ANTLR start "rule__Geometry__Group_8__1"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:762:1: rule__Geometry__Group_8__1 : rule__Geometry__Group_8__1__Impl ;
    public final void rule__Geometry__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:766:1: ( rule__Geometry__Group_8__1__Impl )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:767:2: rule__Geometry__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group_8__1__Impl_in_rule__Geometry__Group_8__11451);
            rule__Geometry__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_8__1"


    // $ANTLR start "rule__Geometry__Group_8__1__Impl"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:773:1: rule__Geometry__Group_8__1__Impl : ( ( rule__Geometry__DimensionsAssignment_8_1 ) ) ;
    public final void rule__Geometry__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:777:1: ( ( ( rule__Geometry__DimensionsAssignment_8_1 ) ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:778:1: ( ( rule__Geometry__DimensionsAssignment_8_1 ) )
            {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:778:1: ( ( rule__Geometry__DimensionsAssignment_8_1 ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:779:1: ( rule__Geometry__DimensionsAssignment_8_1 )
            {
             before(grammarAccess.getGeometryAccess().getDimensionsAssignment_8_1()); 
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:780:1: ( rule__Geometry__DimensionsAssignment_8_1 )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:780:2: rule__Geometry__DimensionsAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Geometry__DimensionsAssignment_8_1_in_rule__Geometry__Group_8__1__Impl1478);
            rule__Geometry__DimensionsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getGeometryAccess().getDimensionsAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_8__1__Impl"


    // $ANTLR start "rule__Geometry__Group_10__0"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:794:1: rule__Geometry__Group_10__0 : rule__Geometry__Group_10__0__Impl rule__Geometry__Group_10__1 ;
    public final void rule__Geometry__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:798:1: ( rule__Geometry__Group_10__0__Impl rule__Geometry__Group_10__1 )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:799:2: rule__Geometry__Group_10__0__Impl rule__Geometry__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group_10__0__Impl_in_rule__Geometry__Group_10__01512);
            rule__Geometry__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group_10__1_in_rule__Geometry__Group_10__01515);
            rule__Geometry__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_10__0"


    // $ANTLR start "rule__Geometry__Group_10__0__Impl"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:806:1: rule__Geometry__Group_10__0__Impl : ( 'neighbors' ) ;
    public final void rule__Geometry__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:810:1: ( ( 'neighbors' ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:811:1: ( 'neighbors' )
            {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:811:1: ( 'neighbors' )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:812:1: 'neighbors'
            {
             before(grammarAccess.getGeometryAccess().getNeighborsKeyword_10_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Geometry__Group_10__0__Impl1543); 
             after(grammarAccess.getGeometryAccess().getNeighborsKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_10__0__Impl"


    // $ANTLR start "rule__Geometry__Group_10__1"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:825:1: rule__Geometry__Group_10__1 : rule__Geometry__Group_10__1__Impl rule__Geometry__Group_10__2 ;
    public final void rule__Geometry__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:829:1: ( rule__Geometry__Group_10__1__Impl rule__Geometry__Group_10__2 )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:830:2: rule__Geometry__Group_10__1__Impl rule__Geometry__Group_10__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group_10__1__Impl_in_rule__Geometry__Group_10__11574);
            rule__Geometry__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group_10__2_in_rule__Geometry__Group_10__11577);
            rule__Geometry__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_10__1"


    // $ANTLR start "rule__Geometry__Group_10__1__Impl"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:837:1: rule__Geometry__Group_10__1__Impl : ( '=' ) ;
    public final void rule__Geometry__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:841:1: ( ( '=' ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:842:1: ( '=' )
            {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:842:1: ( '=' )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:843:1: '='
            {
             before(grammarAccess.getGeometryAccess().getEqualsSignKeyword_10_1()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Geometry__Group_10__1__Impl1605); 
             after(grammarAccess.getGeometryAccess().getEqualsSignKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_10__1__Impl"


    // $ANTLR start "rule__Geometry__Group_10__2"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:856:1: rule__Geometry__Group_10__2 : rule__Geometry__Group_10__2__Impl rule__Geometry__Group_10__3 ;
    public final void rule__Geometry__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:860:1: ( rule__Geometry__Group_10__2__Impl rule__Geometry__Group_10__3 )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:861:2: rule__Geometry__Group_10__2__Impl rule__Geometry__Group_10__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group_10__2__Impl_in_rule__Geometry__Group_10__21636);
            rule__Geometry__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group_10__3_in_rule__Geometry__Group_10__21639);
            rule__Geometry__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_10__2"


    // $ANTLR start "rule__Geometry__Group_10__2__Impl"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:868:1: rule__Geometry__Group_10__2__Impl : ( '(' ) ;
    public final void rule__Geometry__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:872:1: ( ( '(' ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:873:1: ( '(' )
            {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:873:1: ( '(' )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:874:1: '('
            {
             before(grammarAccess.getGeometryAccess().getLeftParenthesisKeyword_10_2()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Geometry__Group_10__2__Impl1667); 
             after(grammarAccess.getGeometryAccess().getLeftParenthesisKeyword_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_10__2__Impl"


    // $ANTLR start "rule__Geometry__Group_10__3"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:887:1: rule__Geometry__Group_10__3 : rule__Geometry__Group_10__3__Impl rule__Geometry__Group_10__4 ;
    public final void rule__Geometry__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:891:1: ( rule__Geometry__Group_10__3__Impl rule__Geometry__Group_10__4 )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:892:2: rule__Geometry__Group_10__3__Impl rule__Geometry__Group_10__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group_10__3__Impl_in_rule__Geometry__Group_10__31698);
            rule__Geometry__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group_10__4_in_rule__Geometry__Group_10__31701);
            rule__Geometry__Group_10__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_10__3"


    // $ANTLR start "rule__Geometry__Group_10__3__Impl"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:899:1: rule__Geometry__Group_10__3__Impl : ( ( rule__Geometry__NeighborsAssignment_10_3 ) ) ;
    public final void rule__Geometry__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:903:1: ( ( ( rule__Geometry__NeighborsAssignment_10_3 ) ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:904:1: ( ( rule__Geometry__NeighborsAssignment_10_3 ) )
            {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:904:1: ( ( rule__Geometry__NeighborsAssignment_10_3 ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:905:1: ( rule__Geometry__NeighborsAssignment_10_3 )
            {
             before(grammarAccess.getGeometryAccess().getNeighborsAssignment_10_3()); 
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:906:1: ( rule__Geometry__NeighborsAssignment_10_3 )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:906:2: rule__Geometry__NeighborsAssignment_10_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Geometry__NeighborsAssignment_10_3_in_rule__Geometry__Group_10__3__Impl1728);
            rule__Geometry__NeighborsAssignment_10_3();

            state._fsp--;


            }

             after(grammarAccess.getGeometryAccess().getNeighborsAssignment_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_10__3__Impl"


    // $ANTLR start "rule__Geometry__Group_10__4"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:916:1: rule__Geometry__Group_10__4 : rule__Geometry__Group_10__4__Impl rule__Geometry__Group_10__5 ;
    public final void rule__Geometry__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:920:1: ( rule__Geometry__Group_10__4__Impl rule__Geometry__Group_10__5 )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:921:2: rule__Geometry__Group_10__4__Impl rule__Geometry__Group_10__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group_10__4__Impl_in_rule__Geometry__Group_10__41758);
            rule__Geometry__Group_10__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group_10__5_in_rule__Geometry__Group_10__41761);
            rule__Geometry__Group_10__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_10__4"


    // $ANTLR start "rule__Geometry__Group_10__4__Impl"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:928:1: rule__Geometry__Group_10__4__Impl : ( ( rule__Geometry__Group_10_4__0 )* ) ;
    public final void rule__Geometry__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:932:1: ( ( ( rule__Geometry__Group_10_4__0 )* ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:933:1: ( ( rule__Geometry__Group_10_4__0 )* )
            {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:933:1: ( ( rule__Geometry__Group_10_4__0 )* )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:934:1: ( rule__Geometry__Group_10_4__0 )*
            {
             before(grammarAccess.getGeometryAccess().getGroup_10_4()); 
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:935:1: ( rule__Geometry__Group_10_4__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:935:2: rule__Geometry__Group_10_4__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group_10_4__0_in_rule__Geometry__Group_10__4__Impl1788);
            	    rule__Geometry__Group_10_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getGeometryAccess().getGroup_10_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_10__4__Impl"


    // $ANTLR start "rule__Geometry__Group_10__5"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:945:1: rule__Geometry__Group_10__5 : rule__Geometry__Group_10__5__Impl ;
    public final void rule__Geometry__Group_10__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:949:1: ( rule__Geometry__Group_10__5__Impl )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:950:2: rule__Geometry__Group_10__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group_10__5__Impl_in_rule__Geometry__Group_10__51819);
            rule__Geometry__Group_10__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_10__5"


    // $ANTLR start "rule__Geometry__Group_10__5__Impl"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:956:1: rule__Geometry__Group_10__5__Impl : ( ')' ) ;
    public final void rule__Geometry__Group_10__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:960:1: ( ( ')' ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:961:1: ( ')' )
            {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:961:1: ( ')' )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:962:1: ')'
            {
             before(grammarAccess.getGeometryAccess().getRightParenthesisKeyword_10_5()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Geometry__Group_10__5__Impl1847); 
             after(grammarAccess.getGeometryAccess().getRightParenthesisKeyword_10_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_10__5__Impl"


    // $ANTLR start "rule__Geometry__Group_10_4__0"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:987:1: rule__Geometry__Group_10_4__0 : rule__Geometry__Group_10_4__0__Impl rule__Geometry__Group_10_4__1 ;
    public final void rule__Geometry__Group_10_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:991:1: ( rule__Geometry__Group_10_4__0__Impl rule__Geometry__Group_10_4__1 )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:992:2: rule__Geometry__Group_10_4__0__Impl rule__Geometry__Group_10_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group_10_4__0__Impl_in_rule__Geometry__Group_10_4__01890);
            rule__Geometry__Group_10_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group_10_4__1_in_rule__Geometry__Group_10_4__01893);
            rule__Geometry__Group_10_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_10_4__0"


    // $ANTLR start "rule__Geometry__Group_10_4__0__Impl"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:999:1: rule__Geometry__Group_10_4__0__Impl : ( ',' ) ;
    public final void rule__Geometry__Group_10_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1003:1: ( ( ',' ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1004:1: ( ',' )
            {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1004:1: ( ',' )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1005:1: ','
            {
             before(grammarAccess.getGeometryAccess().getCommaKeyword_10_4_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Geometry__Group_10_4__0__Impl1921); 
             after(grammarAccess.getGeometryAccess().getCommaKeyword_10_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_10_4__0__Impl"


    // $ANTLR start "rule__Geometry__Group_10_4__1"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1018:1: rule__Geometry__Group_10_4__1 : rule__Geometry__Group_10_4__1__Impl ;
    public final void rule__Geometry__Group_10_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1022:1: ( rule__Geometry__Group_10_4__1__Impl )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1023:2: rule__Geometry__Group_10_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Geometry__Group_10_4__1__Impl_in_rule__Geometry__Group_10_4__11952);
            rule__Geometry__Group_10_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_10_4__1"


    // $ANTLR start "rule__Geometry__Group_10_4__1__Impl"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1029:1: rule__Geometry__Group_10_4__1__Impl : ( ( rule__Geometry__NeighborsAssignment_10_4_1 ) ) ;
    public final void rule__Geometry__Group_10_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1033:1: ( ( ( rule__Geometry__NeighborsAssignment_10_4_1 ) ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1034:1: ( ( rule__Geometry__NeighborsAssignment_10_4_1 ) )
            {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1034:1: ( ( rule__Geometry__NeighborsAssignment_10_4_1 ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1035:1: ( rule__Geometry__NeighborsAssignment_10_4_1 )
            {
             before(grammarAccess.getGeometryAccess().getNeighborsAssignment_10_4_1()); 
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1036:1: ( rule__Geometry__NeighborsAssignment_10_4_1 )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1036:2: rule__Geometry__NeighborsAssignment_10_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Geometry__NeighborsAssignment_10_4_1_in_rule__Geometry__Group_10_4__1__Impl1979);
            rule__Geometry__NeighborsAssignment_10_4_1();

            state._fsp--;


            }

             after(grammarAccess.getGeometryAccess().getNeighborsAssignment_10_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Group_10_4__1__Impl"


    // $ANTLR start "rule__Geometry__NDimAssignment_2_2"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1056:1: rule__Geometry__NDimAssignment_2_2 : ( ruleInteger ) ;
    public final void rule__Geometry__NDimAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1060:1: ( ( ruleInteger ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1061:1: ( ruleInteger )
            {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1061:1: ( ruleInteger )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1062:1: ruleInteger
            {
             before(grammarAccess.getGeometryAccess().getNDimIntegerParserRuleCall_2_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_rule__Geometry__NDimAssignment_2_22023);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getGeometryAccess().getNDimIntegerParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__NDimAssignment_2_2"


    // $ANTLR start "rule__Geometry__IsCircularAssignment_3_2"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1071:1: rule__Geometry__IsCircularAssignment_3_2 : ( ruleBool ) ;
    public final void rule__Geometry__IsCircularAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1075:1: ( ( ruleBool ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1076:1: ( ruleBool )
            {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1076:1: ( ruleBool )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1077:1: ruleBool
            {
             before(grammarAccess.getGeometryAccess().getIsCircularBoolParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBool_in_rule__Geometry__IsCircularAssignment_3_22054);
            ruleBool();

            state._fsp--;

             after(grammarAccess.getGeometryAccess().getIsCircularBoolParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__IsCircularAssignment_3_2"


    // $ANTLR start "rule__Geometry__DimensionsAssignment_7"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1086:1: rule__Geometry__DimensionsAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Geometry__DimensionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1090:1: ( ( ( RULE_ID ) ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1091:1: ( ( RULE_ID ) )
            {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1091:1: ( ( RULE_ID ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1092:1: ( RULE_ID )
            {
             before(grammarAccess.getGeometryAccess().getDimensionsDimensionCrossReference_7_0()); 
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1093:1: ( RULE_ID )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1094:1: RULE_ID
            {
             before(grammarAccess.getGeometryAccess().getDimensionsDimensionIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Geometry__DimensionsAssignment_72089); 
             after(grammarAccess.getGeometryAccess().getDimensionsDimensionIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getGeometryAccess().getDimensionsDimensionCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__DimensionsAssignment_7"


    // $ANTLR start "rule__Geometry__DimensionsAssignment_8_1"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1105:1: rule__Geometry__DimensionsAssignment_8_1 : ( ( RULE_ID ) ) ;
    public final void rule__Geometry__DimensionsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1109:1: ( ( ( RULE_ID ) ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1110:1: ( ( RULE_ID ) )
            {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1110:1: ( ( RULE_ID ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1111:1: ( RULE_ID )
            {
             before(grammarAccess.getGeometryAccess().getDimensionsDimensionCrossReference_8_1_0()); 
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1112:1: ( RULE_ID )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1113:1: RULE_ID
            {
             before(grammarAccess.getGeometryAccess().getDimensionsDimensionIDTerminalRuleCall_8_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Geometry__DimensionsAssignment_8_12128); 
             after(grammarAccess.getGeometryAccess().getDimensionsDimensionIDTerminalRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getGeometryAccess().getDimensionsDimensionCrossReference_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__DimensionsAssignment_8_1"


    // $ANTLR start "rule__Geometry__NeighborsAssignment_10_3"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1124:1: rule__Geometry__NeighborsAssignment_10_3 : ( ( RULE_ID ) ) ;
    public final void rule__Geometry__NeighborsAssignment_10_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1128:1: ( ( ( RULE_ID ) ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1129:1: ( ( RULE_ID ) )
            {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1129:1: ( ( RULE_ID ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1130:1: ( RULE_ID )
            {
             before(grammarAccess.getGeometryAccess().getNeighborsNeighborCrossReference_10_3_0()); 
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1131:1: ( RULE_ID )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1132:1: RULE_ID
            {
             before(grammarAccess.getGeometryAccess().getNeighborsNeighborIDTerminalRuleCall_10_3_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Geometry__NeighborsAssignment_10_32167); 
             after(grammarAccess.getGeometryAccess().getNeighborsNeighborIDTerminalRuleCall_10_3_0_1()); 

            }

             after(grammarAccess.getGeometryAccess().getNeighborsNeighborCrossReference_10_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__NeighborsAssignment_10_3"


    // $ANTLR start "rule__Geometry__NeighborsAssignment_10_4_1"
    // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1143:1: rule__Geometry__NeighborsAssignment_10_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Geometry__NeighborsAssignment_10_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1147:1: ( ( ( RULE_ID ) ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1148:1: ( ( RULE_ID ) )
            {
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1148:1: ( ( RULE_ID ) )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1149:1: ( RULE_ID )
            {
             before(grammarAccess.getGeometryAccess().getNeighborsNeighborCrossReference_10_4_1_0()); 
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1150:1: ( RULE_ID )
            // ../fr.istic.m2.idm.xtext.ui/src-gen/fr/istic/m2/idm/xtext/ui/contentassist/antlr/internal/InternalTopanl.g:1151:1: RULE_ID
            {
             before(grammarAccess.getGeometryAccess().getNeighborsNeighborIDTerminalRuleCall_10_4_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Geometry__NeighborsAssignment_10_4_12206); 
             after(grammarAccess.getGeometryAccess().getNeighborsNeighborIDTerminalRuleCall_10_4_1_0_1()); 

            }

             after(grammarAccess.getGeometryAccess().getNeighborsNeighborCrossReference_10_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__NeighborsAssignment_10_4_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleGeometry_in_entryRuleGeometry61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGeometry68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Geometry__Group__0_in_ruleGeometry94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger125 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInteger132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleInteger159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBool_in_entryRuleBool187 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBool194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleBool221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Geometry__Group__0__Impl_in_rule__Geometry__Group__0256 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Geometry__Group__1_in_rule__Geometry__Group__0259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Geometry__Group__0__Impl287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Geometry__Group__1__Impl_in_rule__Geometry__Group__1318 = new BitSet(new long[]{0x0000000000308000L});
        public static final BitSet FOLLOW_rule__Geometry__Group__2_in_rule__Geometry__Group__1321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Geometry__Group__1__Impl349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Geometry__Group__2__Impl_in_rule__Geometry__Group__2380 = new BitSet(new long[]{0x0000000000308000L});
        public static final BitSet FOLLOW_rule__Geometry__Group__3_in_rule__Geometry__Group__2383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Geometry__Group_2__0_in_rule__Geometry__Group__2__Impl410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Geometry__Group__3__Impl_in_rule__Geometry__Group__3441 = new BitSet(new long[]{0x0000000000308000L});
        public static final BitSet FOLLOW_rule__Geometry__Group__4_in_rule__Geometry__Group__3444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Geometry__Group_3__0_in_rule__Geometry__Group__3__Impl471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Geometry__Group__4__Impl_in_rule__Geometry__Group__4502 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Geometry__Group__5_in_rule__Geometry__Group__4505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Geometry__Group__4__Impl533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Geometry__Group__5__Impl_in_rule__Geometry__Group__5564 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Geometry__Group__6_in_rule__Geometry__Group__5567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Geometry__Group__5__Impl595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Geometry__Group__6__Impl_in_rule__Geometry__Group__6626 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Geometry__Group__7_in_rule__Geometry__Group__6629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Geometry__Group__6__Impl657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Geometry__Group__7__Impl_in_rule__Geometry__Group__7688 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_rule__Geometry__Group__8_in_rule__Geometry__Group__7691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Geometry__DimensionsAssignment_7_in_rule__Geometry__Group__7__Impl718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Geometry__Group__8__Impl_in_rule__Geometry__Group__8748 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_rule__Geometry__Group__9_in_rule__Geometry__Group__8751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Geometry__Group_8__0_in_rule__Geometry__Group__8__Impl778 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__Geometry__Group__9__Impl_in_rule__Geometry__Group__9809 = new BitSet(new long[]{0x0000000000880000L});
        public static final BitSet FOLLOW_rule__Geometry__Group__10_in_rule__Geometry__Group__9812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Geometry__Group__9__Impl840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Geometry__Group__10__Impl_in_rule__Geometry__Group__10871 = new BitSet(new long[]{0x0000000000880000L});
        public static final BitSet FOLLOW_rule__Geometry__Group__11_in_rule__Geometry__Group__10874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Geometry__Group_10__0_in_rule__Geometry__Group__10__Impl901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Geometry__Group__11__Impl_in_rule__Geometry__Group__11932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Geometry__Group__11__Impl960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Geometry__Group_2__0__Impl_in_rule__Geometry__Group_2__01015 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Geometry__Group_2__1_in_rule__Geometry__Group_2__01018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Geometry__Group_2__0__Impl1046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Geometry__Group_2__1__Impl_in_rule__Geometry__Group_2__11077 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Geometry__Group_2__2_in_rule__Geometry__Group_2__11080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Geometry__Group_2__1__Impl1108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Geometry__Group_2__2__Impl_in_rule__Geometry__Group_2__21139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Geometry__NDimAssignment_2_2_in_rule__Geometry__Group_2__2__Impl1166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Geometry__Group_3__0__Impl_in_rule__Geometry__Group_3__01202 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Geometry__Group_3__1_in_rule__Geometry__Group_3__01205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Geometry__Group_3__0__Impl1233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Geometry__Group_3__1__Impl_in_rule__Geometry__Group_3__11264 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Geometry__Group_3__2_in_rule__Geometry__Group_3__11267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Geometry__Group_3__1__Impl1295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Geometry__Group_3__2__Impl_in_rule__Geometry__Group_3__21326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Geometry__IsCircularAssignment_3_2_in_rule__Geometry__Group_3__2__Impl1353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Geometry__Group_8__0__Impl_in_rule__Geometry__Group_8__01389 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Geometry__Group_8__1_in_rule__Geometry__Group_8__01392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Geometry__Group_8__0__Impl1420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Geometry__Group_8__1__Impl_in_rule__Geometry__Group_8__11451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Geometry__DimensionsAssignment_8_1_in_rule__Geometry__Group_8__1__Impl1478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Geometry__Group_10__0__Impl_in_rule__Geometry__Group_10__01512 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Geometry__Group_10__1_in_rule__Geometry__Group_10__01515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Geometry__Group_10__0__Impl1543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Geometry__Group_10__1__Impl_in_rule__Geometry__Group_10__11574 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Geometry__Group_10__2_in_rule__Geometry__Group_10__11577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Geometry__Group_10__1__Impl1605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Geometry__Group_10__2__Impl_in_rule__Geometry__Group_10__21636 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Geometry__Group_10__3_in_rule__Geometry__Group_10__21639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Geometry__Group_10__2__Impl1667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Geometry__Group_10__3__Impl_in_rule__Geometry__Group_10__31698 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_rule__Geometry__Group_10__4_in_rule__Geometry__Group_10__31701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Geometry__NeighborsAssignment_10_3_in_rule__Geometry__Group_10__3__Impl1728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Geometry__Group_10__4__Impl_in_rule__Geometry__Group_10__41758 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_rule__Geometry__Group_10__5_in_rule__Geometry__Group_10__41761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Geometry__Group_10_4__0_in_rule__Geometry__Group_10__4__Impl1788 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__Geometry__Group_10__5__Impl_in_rule__Geometry__Group_10__51819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Geometry__Group_10__5__Impl1847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Geometry__Group_10_4__0__Impl_in_rule__Geometry__Group_10_4__01890 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Geometry__Group_10_4__1_in_rule__Geometry__Group_10_4__01893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Geometry__Group_10_4__0__Impl1921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Geometry__Group_10_4__1__Impl_in_rule__Geometry__Group_10_4__11952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Geometry__NeighborsAssignment_10_4_1_in_rule__Geometry__Group_10_4__1__Impl1979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_rule__Geometry__NDimAssignment_2_22023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBool_in_rule__Geometry__IsCircularAssignment_3_22054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Geometry__DimensionsAssignment_72089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Geometry__DimensionsAssignment_8_12128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Geometry__NeighborsAssignment_10_32167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Geometry__NeighborsAssignment_10_4_12206 = new BitSet(new long[]{0x0000000000000002L});
    }


}