package org.matheclipse.integrate.rubi45;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.integrate.rubi45.UtilityFunctionCtors.*;
import static org.matheclipse.integrate.rubi45.UtilityFunctions.*;
import org.matheclipse.core.interfaces.IAST;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules73 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_),Plus(A_,Times(B_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Times(d,Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)),Tan(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Sec(Plus(e,Times(f,x)))),Plus(n,Negate(C1))),Power(Times(f,Plus(m,C1),Plus(Sqr(a),Negate(Sqr(b)))),-1)),Times(Power(Times(Plus(m,C1),Plus(Sqr(a),Negate(Sqr(b)))),-1),Int(Times(Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Sec(Plus(e,Times(f,x)))),Plus(n,Negate(C1))),Simp(Plus(Times(d,Plus(n,Negate(C1)),Plus(Times(ASymbol,b),Times(CN1,a,BSymbol))),Times(d,Plus(Times(a,ASymbol),Times(CN1,b,BSymbol)),Plus(m,C1),Sec(Plus(e,Times(f,x)))),Times(CN1,d,Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)),Plus(m,n,C1),Sqr(Sec(Plus(e,Times(f,x)))))),x)),x))),And(And(And(And(And(FreeQ(List(a,b,d,e,f,ASymbol,BSymbol),x),NonzeroQ(Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)))),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),RationalQ(m,n)),Less(m,CN1)),Less(Less(C0,n),C1)))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(d_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_),Plus(A_,Times(B_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Times(CN1,d,Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)),Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,Negate(C1))),Power(Times(f,Plus(m,C1),Plus(Sqr(a),Negate(Sqr(b)))),-1)),Times(Power(Times(Plus(m,C1),Plus(Sqr(a),Negate(Sqr(b)))),-1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,Negate(C1))),Simp(Plus(Times(d,Plus(n,Negate(C1)),Plus(Times(ASymbol,b),Times(CN1,a,BSymbol))),Times(d,Plus(Times(a,ASymbol),Times(CN1,b,BSymbol)),Plus(m,C1),Csc(Plus(e,Times(f,x)))),Times(CN1,d,Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)),Plus(m,n,C1),Sqr(Csc(Plus(e,Times(f,x)))))),x)),x))),And(And(And(And(And(FreeQ(List(a,b,d,e,f,ASymbol,BSymbol),x),NonzeroQ(Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)))),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),RationalQ(m,n)),Less(m,CN1)),Less(Less(C0,n),C1)))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_),Plus(A_,Times(B_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Times(CN1,a,Sqr(d),Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)),Tan(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Sec(Plus(e,Times(f,x)))),Plus(n,Negate(C2))),Power(Times(b,f,Plus(m,C1),Plus(Sqr(a),Negate(Sqr(b)))),-1)),Times(CN1,d,Power(Times(b,Plus(m,C1),Plus(Sqr(a),Negate(Sqr(b)))),-1),Int(Times(Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Sec(Plus(e,Times(f,x)))),Plus(n,Negate(C2))),Simp(Plus(Times(a,d,Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)),Plus(n,Negate(C2))),Times(b,d,Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)),Plus(m,C1),Sec(Plus(e,Times(f,x)))),Times(CN1,Plus(Times(a,ASymbol,b,d,Plus(m,n)),Times(CN1,d,BSymbol,Plus(Times(Sqr(a),Plus(n,Negate(C1))),Times(Sqr(b),Plus(m,C1))))),Sqr(Sec(Plus(e,Times(f,x)))))),x)),x))),And(And(And(And(And(FreeQ(List(a,b,d,e,f,ASymbol,BSymbol),x),NonzeroQ(Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)))),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),RationalQ(m,n)),Less(m,CN1)),Greater(n,C1)))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(d_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_),Plus(A_,Times(B_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Times(a,Sqr(d),Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)),Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,Negate(C2))),Power(Times(b,f,Plus(m,C1),Plus(Sqr(a),Negate(Sqr(b)))),-1)),Times(CN1,d,Power(Times(b,Plus(m,C1),Plus(Sqr(a),Negate(Sqr(b)))),-1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,Negate(C2))),Simp(Plus(Times(a,d,Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)),Plus(n,Negate(C2))),Times(b,d,Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)),Plus(m,C1),Csc(Plus(e,Times(f,x)))),Times(CN1,Plus(Times(a,ASymbol,b,d,Plus(m,n)),Times(CN1,d,BSymbol,Plus(Times(Sqr(a),Plus(n,Negate(C1))),Times(Sqr(b),Plus(m,C1))))),Sqr(Csc(Plus(e,Times(f,x)))))),x)),x))),And(And(And(And(And(FreeQ(List(a,b,d,e,f,ASymbol,BSymbol),x),NonzeroQ(Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)))),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),RationalQ(m,n)),Less(m,CN1)),Greater(n,C1)))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_),Plus(A_,Times(B_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Times(CN1,b,Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)),Tan(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Sec(Plus(e,Times(f,x)))),n),Power(Times(a,f,Plus(m,C1),Plus(Sqr(a),Negate(Sqr(b)))),-1)),Times(Power(Times(a,Plus(m,C1),Plus(Sqr(a),Negate(Sqr(b)))),-1),Int(Times(Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Sec(Plus(e,Times(f,x)))),n),Simp(Plus(Times(ASymbol,Plus(Times(Sqr(a),Plus(m,C1)),Times(CN1,Sqr(b),Plus(m,n,C1)))),Times(a,b,BSymbol,n),Times(CN1,a,Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)),Plus(m,C1),Sec(Plus(e,Times(f,x)))),Times(b,Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)),Plus(m,n,C2),Sqr(Sec(Plus(e,Times(f,x)))))),x)),x))),And(And(And(And(And(FreeQ(List(a,b,d,e,f,ASymbol,BSymbol,n),x),NonzeroQ(Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)))),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),RationalQ(m)),Less(m,CN1)),Not(NegativeIntegerQ(Plus(m,C1D2),n))))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(d_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_),Plus(A_,Times(B_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Times(b,Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)),Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Csc(Plus(e,Times(f,x)))),n),Power(Times(a,f,Plus(m,C1),Plus(Sqr(a),Negate(Sqr(b)))),-1)),Times(Power(Times(a,Plus(m,C1),Plus(Sqr(a),Negate(Sqr(b)))),-1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Csc(Plus(e,Times(f,x)))),n),Simp(Plus(Times(ASymbol,Plus(Times(Sqr(a),Plus(m,C1)),Times(CN1,Sqr(b),Plus(m,n,C1)))),Times(a,b,BSymbol,n),Times(CN1,a,Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)),Plus(m,C1),Csc(Plus(e,Times(f,x)))),Times(b,Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)),Plus(m,n,C2),Sqr(Csc(Plus(e,Times(f,x)))))),x)),x))),And(And(And(And(And(FreeQ(List(a,b,d,e,f,ASymbol,BSymbol,n),x),NonzeroQ(Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)))),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),RationalQ(m)),Less(m,CN1)),Not(NegativeIntegerQ(Plus(m,C1D2),n))))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_),Plus(A_,Times(B_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Times(BSymbol,d,Tan(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),m),Power(Times(d,Sec(Plus(e,Times(f,x)))),Plus(n,Negate(C1))),Power(Times(f,Plus(m,n)),-1)),Times(d,Power(Plus(m,n),-1),Int(Times(Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),Plus(m,Negate(C1))),Power(Times(d,Sec(Plus(e,Times(f,x)))),Plus(n,Negate(C1))),Simp(Plus(Times(a,BSymbol,Plus(n,Negate(C1))),Times(Plus(Times(b,BSymbol,Plus(m,n,Negate(C1))),Times(a,ASymbol,Plus(m,n))),Sec(Plus(e,Times(f,x)))),Times(Plus(Times(a,BSymbol,m),Times(ASymbol,b,Plus(m,n))),Sqr(Sec(Plus(e,Times(f,x)))))),x)),x))),And(And(And(And(And(FreeQ(List(a,b,d,e,f,ASymbol,BSymbol),x),NonzeroQ(Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)))),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),RationalQ(m,n)),Less(Less(C0,m),C1)),Greater(n,C0)))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(d_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_),Plus(A_,Times(B_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Times(CN1,BSymbol,d,Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,Negate(C1))),Power(Times(f,Plus(m,n)),-1)),Times(d,Power(Plus(m,n),-1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,Negate(C1))),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,Negate(C1))),Simp(Plus(Times(a,BSymbol,Plus(n,Negate(C1))),Times(Plus(Times(b,BSymbol,Plus(m,n,Negate(C1))),Times(a,ASymbol,Plus(m,n))),Csc(Plus(e,Times(f,x)))),Times(Plus(Times(a,BSymbol,m),Times(ASymbol,b,Plus(m,n))),Sqr(Csc(Plus(e,Times(f,x)))))),x)),x))),And(And(And(And(And(FreeQ(List(a,b,d,e,f,ASymbol,BSymbol),x),NonzeroQ(Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)))),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),RationalQ(m,n)),Less(Less(C0,m),C1)),Greater(n,C0)))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_),Plus(A_,Times(B_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Times(CN1,ASymbol,Tan(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),m),Power(Times(d,Sec(Plus(e,Times(f,x)))),n),Power(Times(f,n),-1)),Times(CN1,Power(Times(d,n),-1),Int(Times(Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),Plus(m,Negate(C1))),Power(Times(d,Sec(Plus(e,Times(f,x)))),Plus(n,C1)),Simp(Plus(Times(ASymbol,b,m),Times(CN1,a,BSymbol,n),Times(CN1,Plus(Times(b,BSymbol,n),Times(a,ASymbol,Plus(n,C1))),Sec(Plus(e,Times(f,x)))),Times(CN1,ASymbol,b,Plus(m,n,C1),Sqr(Sec(Plus(e,Times(f,x)))))),x)),x))),And(And(And(And(And(FreeQ(List(a,b,d,e,f,ASymbol,BSymbol),x),NonzeroQ(Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)))),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),RationalQ(m,n)),Less(Less(C0,m),C1)),LessEqual(n,CN1)))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(d_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_),Plus(A_,Times(B_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Times(ASymbol,Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Times(d,Csc(Plus(e,Times(f,x)))),n),Power(Times(f,n),-1)),Times(CN1,Power(Times(d,n),-1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,Negate(C1))),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,C1)),Simp(Plus(Times(ASymbol,b,m),Times(CN1,a,BSymbol,n),Times(CN1,Plus(Times(b,BSymbol,n),Times(a,ASymbol,Plus(n,C1))),Csc(Plus(e,Times(f,x)))),Times(CN1,ASymbol,b,Plus(m,n,C1),Sqr(Csc(Plus(e,Times(f,x)))))),x)),x))),And(And(And(And(And(FreeQ(List(a,b,d,e,f,ASymbol,BSymbol),x),NonzeroQ(Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)))),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),RationalQ(m,n)),Less(Less(C0,m),C1)),LessEqual(n,CN1)))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_),Plus(A_,Times(B_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Times(BSymbol,Sqr(d),Tan(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Sec(Plus(e,Times(f,x)))),Plus(n,Negate(C2))),Power(Times(b,f,Plus(m,n)),-1)),Times(Sqr(d),Power(Times(b,Plus(m,n)),-1),Int(Times(Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),m),Power(Times(d,Sec(Plus(e,Times(f,x)))),Plus(n,Negate(C2))),Simp(Plus(Times(a,BSymbol,Plus(n,Negate(C2))),Times(BSymbol,b,Plus(m,n,Negate(C1)),Sec(Plus(e,Times(f,x)))),Times(Plus(Times(ASymbol,b,Plus(m,n)),Times(CN1,a,BSymbol,Plus(n,Negate(C1)))),Sqr(Sec(Plus(e,Times(f,x)))))),x)),x))),And(And(And(And(And(And(FreeQ(List(a,b,d,e,f,ASymbol,BSymbol,m),x),NonzeroQ(Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)))),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),RationalQ(n)),Greater(n,C1)),NonzeroQ(Plus(m,n))),Not(And(IntegerQ(m),Greater(m,C1)))))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(d_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_),Plus(A_,Times(B_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Times(CN1,BSymbol,Sqr(d),Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,Negate(C2))),Power(Times(b,f,Plus(m,n)),-1)),Times(Sqr(d),Power(Times(b,Plus(m,n)),-1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,Negate(C2))),Simp(Plus(Times(a,BSymbol,Plus(n,Negate(C2))),Times(BSymbol,b,Plus(m,n,Negate(C1)),Csc(Plus(e,Times(f,x)))),Times(Plus(Times(ASymbol,b,Plus(m,n)),Times(CN1,a,BSymbol,Plus(n,Negate(C1)))),Sqr(Csc(Plus(e,Times(f,x)))))),x)),x))),And(And(And(And(And(And(FreeQ(List(a,b,d,e,f,ASymbol,BSymbol,m),x),NonzeroQ(Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)))),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),RationalQ(n)),Greater(n,C1)),NonzeroQ(Plus(m,n))),Not(And(IntegerQ(m),Greater(m,C1)))))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_),Plus(A_,Times(B_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Times(CN1,ASymbol,Tan(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Sec(Plus(e,Times(f,x)))),n),Power(Times(a,f,n),-1)),Times(Power(Times(a,d,n),-1),Int(Times(Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),m),Power(Times(d,Sec(Plus(e,Times(f,x)))),Plus(n,C1)),Simp(Plus(Times(a,BSymbol,n),Times(CN1,ASymbol,b,Plus(m,n,C1)),Times(ASymbol,a,Plus(n,C1),Sec(Plus(e,Times(f,x)))),Times(ASymbol,b,Plus(m,n,C2),Sqr(Sec(Plus(e,Times(f,x)))))),x)),x))),And(And(And(And(FreeQ(List(a,b,d,e,f,ASymbol,BSymbol,m),x),NonzeroQ(Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)))),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),RationalQ(n)),LessEqual(n,CN1)))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(d_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_),Plus(A_,Times(B_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Times(ASymbol,Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Csc(Plus(e,Times(f,x)))),n),Power(Times(a,f,n),-1)),Times(Power(Times(a,d,n),-1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,C1)),Simp(Plus(Times(a,BSymbol,n),Times(CN1,ASymbol,b,Plus(m,n,C1)),Times(ASymbol,a,Plus(n,C1),Csc(Plus(e,Times(f,x)))),Times(ASymbol,b,Plus(m,n,C2),Sqr(Csc(Plus(e,Times(f,x)))))),x)),x))),And(And(And(And(FreeQ(List(a,b,d,e,f,ASymbol,BSymbol,m),x),NonzeroQ(Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)))),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))),RationalQ(n)),LessEqual(n,CN1)))),
ISetDelayed(Int(Times(Plus(A_,Times(B_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Power(Times(Sqrt(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Sqrt(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),-1)),x_Symbol),
    Condition(Plus(Times(ASymbol,Power(a,-1),Int(Times(Sqrt(Plus(a,Times(b,Sec(Plus(e,Times(f,x)))))),Power(Times(d,Sec(Plus(e,Times(f,x)))),CN1D2)),x)),Times(CN1,Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)),Power(Times(a,d),-1),Int(Times(Sqrt(Times(d,Sec(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),CN1D2)),x))),And(And(FreeQ(List(a,b,d,e,f,ASymbol,BSymbol),x),NonzeroQ(Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)))),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))))),
ISetDelayed(Int(Times(Plus(A_,Times(B_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Power(Times(Sqrt(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Sqrt(Times(d_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),-1)),x_Symbol),
    Condition(Plus(Times(ASymbol,Power(a,-1),Int(Times(Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Power(Times(d,Csc(Plus(e,Times(f,x)))),CN1D2)),x)),Times(CN1,Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)),Power(Times(a,d),-1),Int(Times(Sqrt(Times(d,Csc(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x))),And(And(FreeQ(List(a,b,d,e,f,ASymbol,BSymbol),x),NonzeroQ(Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)))),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))))),
ISetDelayed(Int(Times(Sqrt(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Plus(A_,Times(B_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2)),x_Symbol),
    Condition(Plus(Times(ASymbol,Int(Times(Sqrt(Times(d,Sec(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),CN1D2)),x)),Times(BSymbol,Power(d,-1),Int(Times(Power(Times(d,Sec(Plus(e,Times(f,x)))),QQ(3L,2L)),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),CN1D2)),x))),And(And(FreeQ(List(a,b,d,e,f,ASymbol,BSymbol),x),NonzeroQ(Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)))),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))))),
ISetDelayed(Int(Times(Sqrt(Times(d_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Plus(A_,Times(B_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2)),x_Symbol),
    Condition(Plus(Times(ASymbol,Int(Times(Sqrt(Times(d,Csc(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x)),Times(BSymbol,Power(d,-1),Int(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),QQ(3L,2L)),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x))),And(And(FreeQ(List(a,b,d,e,f,ASymbol,BSymbol),x),NonzeroQ(Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)))),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))))),
ISetDelayed(Int(Times(Sqrt(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Plus(A_,Times(B_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),CN1D2)),x_Symbol),
    Condition(Plus(Times(BSymbol,Power(d,-1),Int(Times(Sqrt(Plus(a,Times(b,Sec(Plus(e,Times(f,x)))))),Sqrt(Times(d,Sec(Plus(e,Times(f,x)))))),x)),Times(ASymbol,Int(Times(Sqrt(Plus(a,Times(b,Sec(Plus(e,Times(f,x)))))),Power(Times(d,Sec(Plus(e,Times(f,x)))),CN1D2)),x))),And(And(FreeQ(List(a,b,d,e,f,ASymbol,BSymbol),x),NonzeroQ(Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)))),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))))),
ISetDelayed(Int(Times(Sqrt(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Plus(A_,Times(B_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Power(Times(d_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),CN1D2)),x_Symbol),
    Condition(Plus(Times(BSymbol,Power(d,-1),Int(Times(Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Sqrt(Times(d,Csc(Plus(e,Times(f,x)))))),x)),Times(ASymbol,Int(Times(Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Power(Times(d,Csc(Plus(e,Times(f,x)))),CN1D2)),x))),And(And(FreeQ(List(a,b,d,e,f,ASymbol,BSymbol),x),NonzeroQ(Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)))),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))))),
ISetDelayed(Int(Times(Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_),Plus(A_,Times(B_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),-1)),x_Symbol),
    Condition(Plus(Times(ASymbol,Power(a,-1),Int(Power(Times(d,Sec(Plus(e,Times(f,x)))),n),x)),Times(CN1,Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)),Power(Times(a,d),-1),Int(Times(Power(Times(d,Sec(Plus(e,Times(f,x)))),Plus(n,C1)),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),-1)),x))),And(And(FreeQ(List(a,b,d,e,f,ASymbol,BSymbol,n),x),NonzeroQ(Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)))),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))))),
ISetDelayed(Int(Times(Power(Times(d_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_),Plus(A_,Times(B_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),-1)),x_Symbol),
    Condition(Plus(Times(ASymbol,Power(a,-1),Int(Power(Times(d,Csc(Plus(e,Times(f,x)))),n),x)),Times(CN1,Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)),Power(Times(a,d),-1),Int(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,C1)),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),-1)),x))),And(And(FreeQ(List(a,b,d,e,f,ASymbol,BSymbol,n),x),NonzeroQ(Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)))),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_DEFAULT),Plus(A_,Times(B_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),m),Power(Times(d,Sec(Plus(e,Times(f,x)))),n),Plus(ASymbol,Times(BSymbol,Sec(Plus(e,Times(f,x)))))),x),And(And(FreeQ(List(a,b,d,e,f,ASymbol,BSymbol,m,n),x),NonzeroQ(Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)))),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b))))))),
ISetDelayed(Int(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(d_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_DEFAULT),Plus(A_,Times(B_DEFAULT,$($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Times(d,Csc(Plus(e,Times(f,x)))),n),Plus(ASymbol,Times(BSymbol,Csc(Plus(e,Times(f,x)))))),x),And(And(FreeQ(List(a,b,d,e,f,ASymbol,BSymbol,m,n),x),NonzeroQ(Plus(Times(ASymbol,b),Times(CN1,a,BSymbol)))),NonzeroQ(Plus(Sqr(a),Negate(Sqr(b)))))))
  );
}