package org.matheclipse.core.integrate.rubi45;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctions.*;

import org.matheclipse.core.interfaces.IAST;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules61 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Times(Plus(A_,Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Times(ASymbol,Power(f,-1),Subst(Int(Power(Plus(a,Times(b,x)),m),x),x,Tan(Plus(e,Times(f,x))))),And(FreeQ(List(a,b,e,f,ASymbol,CSymbol,m),x),ZeroQ(Plus(ASymbol,Negate(CSymbol)))))),
ISetDelayed(Int(Times(Plus(A_,Times(C_DEFAULT,Sqr($($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Times(CN1,ASymbol,Power(f,-1),Subst(Int(Power(Plus(a,Times(b,x)),m),x),x,Cot(Plus(e,Times(f,x))))),And(FreeQ(List(a,b,e,f,ASymbol,CSymbol,m),x),ZeroQ(Plus(ASymbol,Negate(CSymbol)))))),
ISetDelayed(Int(Times(Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(b,-2),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Simp(Plus(Times(b,BSymbol),Times(CN1,a,CSymbol),Times(b,CSymbol,Tan(Plus(e,Times(f,x))))),x)),x)),And(FreeQ(List(a,b,e,f,ASymbol,BSymbol,CSymbol,m),x),ZeroQ(Plus(Times(ASymbol,Sqr(b)),Times(CN1,a,b,BSymbol),Times(Sqr(a),CSymbol)))))),
ISetDelayed(Int(Times(Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times(C_DEFAULT,Sqr($($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(b,-2),Int(Times(Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),Plus(m,C1)),Simp(Plus(Times(b,BSymbol),Times(CN1,a,CSymbol),Times(b,CSymbol,Cot(Plus(e,Times(f,x))))),x)),x)),And(FreeQ(List(a,b,e,f,ASymbol,BSymbol,CSymbol,m),x),ZeroQ(Plus(Times(ASymbol,Sqr(b)),Times(CN1,a,b,BSymbol),Times(Sqr(a),CSymbol)))))),
ISetDelayed(Int(Times(Plus(A_DEFAULT,Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Times(CN1,CSymbol,Power(b,-2),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Plus(a,Times(CN1,b,Tan(Plus(e,Times(f,x)))))),x)),And(FreeQ(List(a,b,e,f,ASymbol,CSymbol,m),x),ZeroQ(Plus(Times(ASymbol,Sqr(b)),Times(Sqr(a),CSymbol)))))),
ISetDelayed(Int(Times(Plus(A_DEFAULT,Times(C_DEFAULT,Sqr($($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Times(CN1,CSymbol,Power(b,-2),Int(Times(Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),Plus(m,C1)),Plus(a,Times(CN1,b,Cot(Plus(e,Times(f,x)))))),x)),And(FreeQ(List(a,b,e,f,ASymbol,CSymbol,m),x),ZeroQ(Plus(Times(ASymbol,Sqr(b)),Times(Sqr(a),CSymbol)))))),
ISetDelayed(Int(Times(Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,Plus(Times(a,ASymbol),Times(b,BSymbol),Times(CN1,a,CSymbol)),Tan(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),m),Power(Times(C2,a,f,m),-1)),Times(Power(Times(C2,Sqr(a),m),-1),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Simp(Plus(Times(b,BSymbol),Times(CN1,a,CSymbol),Times(a,ASymbol,Plus(Times(C2,m),C1)),Times(CN1,Plus(Times(b,CSymbol,Plus(m,Negate(C1))),Times(Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)),Plus(m,C1))),Tan(Plus(e,Times(f,x))))),x)),x))),And(And(And(And(FreeQ(List(a,b,e,f,ASymbol,BSymbol,CSymbol),x),NonzeroQ(Plus(Times(ASymbol,Sqr(b)),Times(CN1,a,b,BSymbol),Times(Sqr(a),CSymbol)))),RationalQ(m)),LessEqual(m,CN1)),ZeroQ(Plus(Sqr(a),Sqr(b)))))),
ISetDelayed(Int(Times(Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times(C_DEFAULT,Sqr($($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Plus(Times(a,ASymbol),Times(b,BSymbol),Times(CN1,a,CSymbol)),Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),m),Power(Times(C2,a,f,m),-1)),Times(Power(Times(C2,Sqr(a),m),-1),Int(Times(Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),Plus(m,C1)),Simp(Plus(Times(b,BSymbol),Times(CN1,a,CSymbol),Times(a,ASymbol,Plus(Times(C2,m),C1)),Times(CN1,Plus(Times(b,CSymbol,Plus(m,Negate(C1))),Times(Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)),Plus(m,C1))),Cot(Plus(e,Times(f,x))))),x)),x))),And(And(And(And(FreeQ(List(a,b,e,f,ASymbol,BSymbol,CSymbol),x),NonzeroQ(Plus(Times(ASymbol,Sqr(b)),Times(CN1,a,b,BSymbol),Times(Sqr(a),CSymbol)))),RationalQ(m)),LessEqual(m,CN1)),ZeroQ(Plus(Sqr(a),Sqr(b)))))),
ISetDelayed(Int(Times(Plus(A_DEFAULT,Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,Plus(Times(a,ASymbol),Times(CN1,a,CSymbol)),Tan(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),m),Power(Times(C2,a,f,m),-1)),Times(Power(Times(C2,Sqr(a),m),-1),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Simp(Plus(Times(CN1,a,CSymbol),Times(a,ASymbol,Plus(Times(C2,m),C1)),Times(CN1,Plus(Times(b,CSymbol,Plus(m,Negate(C1))),Times(ASymbol,b,Plus(m,C1))),Tan(Plus(e,Times(f,x))))),x)),x))),And(And(And(And(FreeQ(List(a,b,e,f,ASymbol,CSymbol),x),NonzeroQ(Plus(Times(ASymbol,Sqr(b)),Times(Sqr(a),CSymbol)))),RationalQ(m)),LessEqual(m,CN1)),ZeroQ(Plus(Sqr(a),Sqr(b)))))),
ISetDelayed(Int(Times(Plus(A_DEFAULT,Times(C_DEFAULT,Sqr($($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Plus(Times(a,ASymbol),Times(CN1,a,CSymbol)),Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),m),Power(Times(C2,a,f,m),-1)),Times(Power(Times(C2,Sqr(a),m),-1),Int(Times(Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),Plus(m,C1)),Simp(Plus(Times(CN1,a,CSymbol),Times(a,ASymbol,Plus(Times(C2,m),C1)),Times(CN1,Plus(Times(b,CSymbol,Plus(m,Negate(C1))),Times(ASymbol,b,Plus(m,C1))),Cot(Plus(e,Times(f,x))))),x)),x))),And(And(And(And(FreeQ(List(a,b,e,f,ASymbol,CSymbol),x),NonzeroQ(Plus(Times(ASymbol,Sqr(b)),Times(Sqr(a),CSymbol)))),RationalQ(m)),LessEqual(m,CN1)),ZeroQ(Plus(Sqr(a),Sqr(b)))))),
ISetDelayed(Int(Times(Plus(A_,Times(B_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),-1)),x_Symbol),
    Condition(Plus(Times(Plus(Times(a,ASymbol),Times(b,BSymbol),Times(CN1,a,CSymbol)),x,Power(Plus(Sqr(a),Sqr(b)),-1)),Times(Plus(Times(ASymbol,Sqr(b)),Times(CN1,a,b,BSymbol),Times(Sqr(a),CSymbol)),Power(Plus(Sqr(a),Sqr(b)),-1),Int(Times(Plus(C1,Sqr(Tan(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),-1)),x))),And(And(FreeQ(List(a,b,e,f,ASymbol,BSymbol,CSymbol),x),NonzeroQ(Plus(Sqr(a),Sqr(b)))),ZeroQ(Plus(Times(ASymbol,b),Times(CN1,a,BSymbol),Times(CN1,b,CSymbol)))))),
ISetDelayed(Int(Times(Plus(A_,Times(B_DEFAULT,$($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times(C_DEFAULT,Sqr($($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),-1)),x_Symbol),
    Condition(Plus(Times(Plus(Times(a,ASymbol),Times(b,BSymbol),Times(CN1,a,CSymbol)),x,Power(Plus(Sqr(a),Sqr(b)),-1)),Times(Plus(Times(ASymbol,Sqr(b)),Times(CN1,a,b,BSymbol),Times(Sqr(a),CSymbol)),Power(Plus(Sqr(a),Sqr(b)),-1),Int(Times(Plus(C1,Sqr(Cot(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),-1)),x))),And(And(FreeQ(List(a,b,e,f,ASymbol,BSymbol,CSymbol),x),NonzeroQ(Plus(Sqr(a),Sqr(b)))),ZeroQ(Plus(Times(ASymbol,b),Times(CN1,a,BSymbol),Times(CN1,b,CSymbol)))))),
ISetDelayed(Int(Times(Plus(A_,Times(B_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),-1)),x_Symbol),
    Condition(Plus(Times(BSymbol,x),Times(ASymbol,Int(Power(Tan(Plus(e,Times(f,x))),-1),x)),Times(CSymbol,Int(Tan(Plus(e,Times(f,x))),x))),And(FreeQ(List(e,f,ASymbol,BSymbol,CSymbol),x),NonzeroQ(Plus(ASymbol,Negate(CSymbol)))))),
ISetDelayed(Int(Times(Plus(A_,Times(B_DEFAULT,$($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times(C_DEFAULT,Sqr($($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power($($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),-1)),x_Symbol),
    Condition(Plus(Times(BSymbol,x),Times(ASymbol,Int(Power(Cot(Plus(e,Times(f,x))),-1),x)),Times(CSymbol,Int(Cot(Plus(e,Times(f,x))),x))),And(FreeQ(List(e,f,ASymbol,BSymbol,CSymbol),x),NonzeroQ(Plus(ASymbol,Negate(CSymbol)))))),
ISetDelayed(Int(Times(Plus(A_,Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),-1)),x_Symbol),
    Condition(Plus(Times(ASymbol,Int(Power(Tan(Plus(e,Times(f,x))),-1),x)),Times(CSymbol,Int(Tan(Plus(e,Times(f,x))),x))),And(FreeQ(List(e,f,ASymbol,CSymbol),x),NonzeroQ(Plus(ASymbol,Negate(CSymbol)))))),
ISetDelayed(Int(Times(Plus(A_,Times(C_DEFAULT,Sqr($($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power($($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),-1)),x_Symbol),
    Condition(Plus(Times(ASymbol,Int(Power(Cot(Plus(e,Times(f,x))),-1),x)),Times(CSymbol,Int(Cot(Plus(e,Times(f,x))),x))),And(FreeQ(List(e,f,ASymbol,CSymbol),x),NonzeroQ(Plus(ASymbol,Negate(CSymbol)))))),
ISetDelayed(Int(Times(Plus(A_,Times(B_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),-1)),x_Symbol),
    Condition(Plus(Times(Plus(Times(a,ASymbol),Times(b,BSymbol),Times(CN1,a,CSymbol)),x,Power(Plus(Sqr(a),Sqr(b)),-1)),Times(CN1,Plus(Times(ASymbol,b),Times(CN1,a,BSymbol),Times(CN1,b,CSymbol)),Power(Plus(Sqr(a),Sqr(b)),-1),Int(Tan(Plus(e,Times(f,x))),x)),Times(Plus(Times(ASymbol,Sqr(b)),Times(CN1,a,b,BSymbol),Times(Sqr(a),CSymbol)),Power(Plus(Sqr(a),Sqr(b)),-1),Int(Times(Plus(C1,Sqr(Tan(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),-1)),x))),And(And(And(FreeQ(List(a,b,e,f,ASymbol,BSymbol,CSymbol),x),NonzeroQ(Plus(Times(ASymbol,Sqr(b)),Times(CN1,a,b,BSymbol),Times(Sqr(a),CSymbol)))),NonzeroQ(Plus(Sqr(a),Sqr(b)))),NonzeroQ(Plus(Times(ASymbol,b),Times(CN1,a,BSymbol),Times(CN1,b,CSymbol)))))),
ISetDelayed(Int(Times(Plus(A_,Times(B_DEFAULT,$($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times(C_DEFAULT,Sqr($($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),-1)),x_Symbol),
    Condition(Plus(Times(Plus(Times(a,ASymbol),Times(b,BSymbol),Times(CN1,a,CSymbol)),x,Power(Plus(Sqr(a),Sqr(b)),-1)),Times(CN1,Plus(Times(ASymbol,b),Times(CN1,a,BSymbol),Times(CN1,b,CSymbol)),Power(Plus(Sqr(a),Sqr(b)),-1),Int(Cot(Plus(e,Times(f,x))),x)),Times(Plus(Times(ASymbol,Sqr(b)),Times(CN1,a,b,BSymbol),Times(Sqr(a),CSymbol)),Power(Plus(Sqr(a),Sqr(b)),-1),Int(Times(Plus(C1,Sqr(Cot(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),-1)),x))),And(And(And(FreeQ(List(a,b,e,f,ASymbol,BSymbol,CSymbol),x),NonzeroQ(Plus(Times(ASymbol,Sqr(b)),Times(CN1,a,b,BSymbol),Times(Sqr(a),CSymbol)))),NonzeroQ(Plus(Sqr(a),Sqr(b)))),NonzeroQ(Plus(Times(ASymbol,b),Times(CN1,a,BSymbol),Times(CN1,b,CSymbol)))))),
ISetDelayed(Int(Times(Plus(A_,Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),-1)),x_Symbol),
    Condition(Plus(Times(a,Plus(ASymbol,Negate(CSymbol)),x,Power(Plus(Sqr(a),Sqr(b)),-1)),Times(CN1,b,Plus(ASymbol,Negate(CSymbol)),Power(Plus(Sqr(a),Sqr(b)),-1),Int(Tan(Plus(e,Times(f,x))),x)),Times(Plus(Times(Sqr(a),CSymbol),Times(ASymbol,Sqr(b))),Power(Plus(Sqr(a),Sqr(b)),-1),Int(Times(Plus(C1,Sqr(Tan(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),-1)),x))),And(And(And(FreeQ(List(a,b,e,f,ASymbol,CSymbol),x),NonzeroQ(Plus(Times(Sqr(a),CSymbol),Times(ASymbol,Sqr(b))))),NonzeroQ(Plus(Sqr(a),Sqr(b)))),NonzeroQ(Plus(ASymbol,Negate(CSymbol)))))),
ISetDelayed(Int(Times(Plus(A_,Times(C_DEFAULT,Sqr($($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),-1)),x_Symbol),
    Condition(Plus(Times(a,Plus(ASymbol,Negate(CSymbol)),x,Power(Plus(Sqr(a),Sqr(b)),-1)),Times(CN1,b,Plus(ASymbol,Negate(CSymbol)),Power(Plus(Sqr(a),Sqr(b)),-1),Int(Cot(Plus(e,Times(f,x))),x)),Times(Plus(Times(Sqr(a),CSymbol),Times(ASymbol,Sqr(b))),Power(Plus(Sqr(a),Sqr(b)),-1),Int(Times(Plus(C1,Sqr(Cot(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),-1)),x))),And(And(And(FreeQ(List(a,b,e,f,ASymbol,CSymbol),x),NonzeroQ(Plus(Times(Sqr(a),CSymbol),Times(ASymbol,Sqr(b))))),NonzeroQ(Plus(Sqr(a),Sqr(b)))),NonzeroQ(Plus(ASymbol,Negate(CSymbol)))))),
ISetDelayed(Int(Times(Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Plus(Times(Plus(Times(ASymbol,Sqr(b)),Times(CN1,a,b,BSymbol),Times(Sqr(a),CSymbol)),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(b,f,Plus(m,C1),Plus(Sqr(a),Sqr(b))),-1)),Times(Power(Plus(Sqr(a),Sqr(b)),-1),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Simp(Plus(Times(b,BSymbol),Times(a,Plus(ASymbol,Negate(CSymbol))),Times(CN1,Plus(Times(ASymbol,b),Times(CN1,a,BSymbol),Times(CN1,b,CSymbol)),Tan(Plus(e,Times(f,x))))),x)),x))),And(And(And(And(FreeQ(List(a,b,e,f,ASymbol,BSymbol,CSymbol),x),NonzeroQ(Plus(Times(ASymbol,Sqr(b)),Times(CN1,a,b,BSymbol),Times(Sqr(a),CSymbol)))),RationalQ(m)),Less(m,CN1)),NonzeroQ(Plus(Sqr(a),Sqr(b)))))),
ISetDelayed(Int(Times(Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times(C_DEFAULT,Sqr($($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Plus(Times(CN1,Plus(Times(ASymbol,Sqr(b)),Times(CN1,a,b,BSymbol),Times(Sqr(a),CSymbol)),Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(b,f,Plus(m,C1),Plus(Sqr(a),Sqr(b))),-1)),Times(Power(Plus(Sqr(a),Sqr(b)),-1),Int(Times(Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),Plus(m,C1)),Simp(Plus(Times(b,BSymbol),Times(a,Plus(ASymbol,Negate(CSymbol))),Times(CN1,Plus(Times(ASymbol,b),Times(CN1,a,BSymbol),Times(CN1,b,CSymbol)),Cot(Plus(e,Times(f,x))))),x)),x))),And(And(And(And(FreeQ(List(a,b,e,f,ASymbol,BSymbol,CSymbol),x),NonzeroQ(Plus(Times(ASymbol,Sqr(b)),Times(CN1,a,b,BSymbol),Times(Sqr(a),CSymbol)))),RationalQ(m)),Less(m,CN1)),NonzeroQ(Plus(Sqr(a),Sqr(b)))))),
ISetDelayed(Int(Times(Plus(A_DEFAULT,Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Plus(Times(Plus(Times(ASymbol,Sqr(b)),Times(Sqr(a),CSymbol)),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(b,f,Plus(m,C1),Plus(Sqr(a),Sqr(b))),-1)),Times(Power(Plus(Sqr(a),Sqr(b)),-1),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Simp(Plus(Times(a,Plus(ASymbol,Negate(CSymbol))),Times(CN1,Plus(Times(ASymbol,b),Times(CN1,b,CSymbol)),Tan(Plus(e,Times(f,x))))),x)),x))),And(And(And(And(FreeQ(List(a,b,e,f,ASymbol,CSymbol),x),NonzeroQ(Plus(Times(ASymbol,Sqr(b)),Times(Sqr(a),CSymbol)))),RationalQ(m)),Less(m,CN1)),NonzeroQ(Plus(Sqr(a),Sqr(b)))))),
ISetDelayed(Int(Times(Plus(A_DEFAULT,Times(C_DEFAULT,Sqr($($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Plus(Times(CN1,Plus(Times(ASymbol,Sqr(b)),Times(Sqr(a),CSymbol)),Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(b,f,Plus(m,C1),Plus(Sqr(a),Sqr(b))),-1)),Times(Power(Plus(Sqr(a),Sqr(b)),-1),Int(Times(Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),Plus(m,C1)),Simp(Plus(Times(a,Plus(ASymbol,Negate(CSymbol))),Times(CN1,Plus(Times(ASymbol,b),Times(CN1,b,CSymbol)),Cot(Plus(e,Times(f,x))))),x)),x))),And(And(And(And(FreeQ(List(a,b,e,f,ASymbol,CSymbol),x),NonzeroQ(Plus(Times(ASymbol,Sqr(b)),Times(Sqr(a),CSymbol)))),RationalQ(m)),Less(m,CN1)),NonzeroQ(Plus(Sqr(a),Sqr(b)))))),
ISetDelayed(Int(Times(Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CSymbol,Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(b,f,Plus(m,C1)),-1)),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),m),Simp(Plus(ASymbol,Negate(CSymbol),Times(BSymbol,Tan(Plus(e,Times(f,x))))),x)),x)),And(And(FreeQ(List(a,b,e,f,ASymbol,BSymbol,CSymbol,m),x),NonzeroQ(Plus(Times(ASymbol,Sqr(b)),Times(CN1,a,b,BSymbol),Times(Sqr(a),CSymbol)))),Not(And(RationalQ(m),LessEqual(m,CN1)))))),
ISetDelayed(Int(Times(Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times(C_DEFAULT,Sqr($($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,CSymbol,Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(b,f,Plus(m,C1)),-1)),Int(Times(Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),m),Simp(Plus(ASymbol,Negate(CSymbol),Times(BSymbol,Cot(Plus(e,Times(f,x))))),x)),x)),And(And(FreeQ(List(a,b,e,f,ASymbol,BSymbol,CSymbol,m),x),NonzeroQ(Plus(Times(ASymbol,Sqr(b)),Times(CN1,a,b,BSymbol),Times(Sqr(a),CSymbol)))),Not(And(RationalQ(m),LessEqual(m,CN1)))))),
ISetDelayed(Int(Times(Plus(A_DEFAULT,Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CSymbol,Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(b,f,Plus(m,C1)),-1)),Times(Plus(ASymbol,Negate(CSymbol)),Int(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),m),x))),And(And(FreeQ(List(a,b,e,f,ASymbol,CSymbol,m),x),NonzeroQ(Plus(Times(ASymbol,Sqr(b)),Times(Sqr(a),CSymbol)))),Not(And(RationalQ(m),LessEqual(m,CN1)))))),
ISetDelayed(Int(Times(Plus(A_DEFAULT,Times(C_DEFAULT,Sqr($($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cot"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,CSymbol,Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(b,f,Plus(m,C1)),-1)),Times(Plus(ASymbol,Negate(CSymbol)),Int(Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),m),x))),And(And(FreeQ(List(a,b,e,f,ASymbol,CSymbol,m),x),NonzeroQ(Plus(Times(ASymbol,Sqr(b)),Times(Sqr(a),CSymbol)))),Not(And(RationalQ(m),LessEqual(m,CN1))))))
  );
}