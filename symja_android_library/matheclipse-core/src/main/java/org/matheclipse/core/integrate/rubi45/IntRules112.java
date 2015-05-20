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
public class IntRules112 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Times(ArcTan(Plus(a_,Times(b_DEFAULT,x_))),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_DEFAULT))),-1)),x_Symbol),
    Condition(Plus(Times(C1D2,CI,Int(Times(Log(Plus(C1,Times(CN1,CI,a),Times(CN1,CI,b,x))),Power(Plus(c,Times(d,Power(x,n))),-1)),x)),Times(CN1,C1D2,CI,Int(Times(Log(Plus(C1,Times(CI,a),Times(CI,b,x))),Power(Plus(c,Times(d,Power(x,n))),-1)),x))),And(FreeQ(List(a,b,c,d),x),RationalQ(n)))),
ISetDelayed(Int(Times(ArcCot(Plus(a_,Times(b_DEFAULT,x_))),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_DEFAULT))),-1)),x_Symbol),
    Condition(Plus(Times(C1D2,CI,Int(Times(Log(Times(Plus(Negate(CI),a,Times(b,x)),Power(Plus(a,Times(b,x)),-1))),Power(Plus(c,Times(d,Power(x,n))),-1)),x)),Times(CN1,C1D2,CI,Int(Times(Log(Times(Plus(CI,a,Times(b,x)),Power(Plus(a,Times(b,x)),-1))),Power(Plus(c,Times(d,Power(x,n))),-1)),x))),And(FreeQ(List(a,b,c,d),x),RationalQ(n)))),
ISetDelayed(Int(Times(ArcTan(Plus(a_,Times(b_DEFAULT,x_))),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),-1)),x_Symbol),
    Condition($(Defer($s("Int")),Times(ArcTan(Plus(a,Times(b,x))),Power(Plus(c,Times(d,Power(x,n))),-1)),x),And(FreeQ(List(a,b,c,d,n),x),Not(RationalQ(n))))),
ISetDelayed(Int(Times(ArcCot(Plus(a_,Times(b_DEFAULT,x_))),Power(Plus(c_,Times(d_DEFAULT,Power(x_,n_))),-1)),x_Symbol),
    Condition($(Defer($s("Int")),Times(ArcCot(Plus(a,Times(b,x))),Power(Plus(c,Times(d,Power(x,n))),-1)),x),And(FreeQ(List(a,b,c,d,n),x),Not(RationalQ(n))))),
ISetDelayed(Int(ArcTan(Plus(a_,Times(b_DEFAULT,Power(x_,n_)))),x_Symbol),
    Condition(Plus(Times(x,ArcTan(Plus(a,Times(b,Power(x,n))))),Times(CN1,b,n,Int(Times(Power(x,n),Power(Plus(C1,Sqr(a),Times(C2,a,b,Power(x,n)),Times(Sqr(b),Power(x,Times(C2,n)))),-1)),x))),FreeQ(List(a,b,n),x))),
ISetDelayed(Int(ArcCot(Plus(a_,Times(b_DEFAULT,Power(x_,n_)))),x_Symbol),
    Condition(Plus(Times(x,ArcCot(Plus(a,Times(b,Power(x,n))))),Times(b,n,Int(Times(Power(x,n),Power(Plus(C1,Sqr(a),Times(C2,a,b,Power(x,n)),Times(Sqr(b),Power(x,Times(C2,n)))),-1)),x))),FreeQ(List(a,b,n),x))),
ISetDelayed(Int(Times(ArcTan(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),Power(x_,-1)),x_Symbol),
    Condition(Plus(Times(C1D2,CI,Int(Times(Log(Plus(C1,Times(CN1,CI,a),Times(CN1,CI,b,Power(x,n)))),Power(x,-1)),x)),Times(CN1,C1D2,CI,Int(Times(Log(Plus(C1,Times(CI,a),Times(CI,b,Power(x,n)))),Power(x,-1)),x))),FreeQ(List(a,b,n),x))),
ISetDelayed(Int(Times(ArcCot(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),Power(x_,-1)),x_Symbol),
    Condition(Plus(Times(C1D2,CI,Int(Times(Log(Plus(C1,Times(CN1,CI,Power(Plus(a,Times(b,Power(x,n))),-1)))),Power(x,-1)),x)),Times(CN1,C1D2,CI,Int(Times(Log(Plus(C1,Times(CI,Power(Plus(a,Times(b,Power(x,n))),-1)))),Power(x,-1)),x))),FreeQ(List(a,b,n),x))),
ISetDelayed(Int(Times(ArcTan(Plus(a_,Times(b_DEFAULT,Power(x_,n_)))),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),ArcTan(Plus(a,Times(b,Power(x,n)))),Power(Plus(m,C1),-1)),Times(CN1,b,n,Power(Plus(m,C1),-1),Int(Times(Power(x,Plus(m,n)),Power(Plus(C1,Sqr(a),Times(C2,a,b,Power(x,n)),Times(Sqr(b),Power(x,Times(C2,n)))),-1)),x))),And(And(And(FreeQ(List(a,b),x),RationalQ(m,n)),Unequal(Plus(m,C1),C0)),Unequal(Plus(m,C1),n)))),
ISetDelayed(Int(Times(ArcCot(Plus(a_,Times(b_DEFAULT,Power(x_,n_)))),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),ArcCot(Plus(a,Times(b,Power(x,n)))),Power(Plus(m,C1),-1)),Times(b,n,Power(Plus(m,C1),-1),Int(Times(Power(x,Plus(m,n)),Power(Plus(C1,Sqr(a),Times(C2,a,b,Power(x,n)),Times(Sqr(b),Power(x,Times(C2,n)))),-1)),x))),And(And(And(FreeQ(List(a,b),x),RationalQ(m,n)),Unequal(Plus(m,C1),C0)),Unequal(Plus(m,C1),n)))),
ISetDelayed(Int(ArcTan(Plus(a_DEFAULT,Times(b_DEFAULT,Power(f_,Plus(c_DEFAULT,Times(d_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Times(C1D2,CI,Int(Log(Plus(C1,Times(CN1,CI,a),Times(CN1,CI,b,Power(f,Plus(c,Times(d,x)))))),x)),Times(CN1,C1D2,CI,Int(Log(Plus(C1,Times(CI,a),Times(CI,b,Power(f,Plus(c,Times(d,x)))))),x))),FreeQ(List(a,b,c,d,f),x))),
ISetDelayed(Int(ArcCot(Plus(a_DEFAULT,Times(b_DEFAULT,Power(f_,Plus(c_DEFAULT,Times(d_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Times(C1D2,CI,Int(Log(Plus(C1,Times(CN1,CI,Power(Plus(a,Times(b,Power(f,Plus(c,Times(d,x))))),-1)))),x)),Times(CN1,C1D2,CI,Int(Log(Plus(C1,Times(CI,Power(Plus(a,Times(b,Power(f,Plus(c,Times(d,x))))),-1)))),x))),FreeQ(List(a,b,c,d,f),x))),
ISetDelayed(Int(Times(ArcTan(Plus(a_DEFAULT,Times(b_DEFAULT,Power(f_,Plus(c_DEFAULT,Times(d_DEFAULT,x_)))))),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(C1D2,CI,Int(Times(Power(x,m),Log(Plus(C1,Times(CN1,CI,a),Times(CN1,CI,b,Power(f,Plus(c,Times(d,x))))))),x)),Times(CN1,C1D2,CI,Int(Times(Power(x,m),Log(Plus(C1,Times(CI,a),Times(CI,b,Power(f,Plus(c,Times(d,x))))))),x))),And(And(FreeQ(List(a,b,c,d,f),x),IntegerQ(m)),Greater(m,C0)))),
ISetDelayed(Int(Times(ArcCot(Plus(a_DEFAULT,Times(b_DEFAULT,Power(f_,Plus(c_DEFAULT,Times(d_DEFAULT,x_)))))),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(C1D2,CI,Int(Times(Power(x,m),Log(Plus(C1,Times(CN1,CI,Power(Plus(a,Times(b,Power(f,Plus(c,Times(d,x))))),-1))))),x)),Times(CN1,C1D2,CI,Int(Times(Power(x,m),Log(Plus(C1,Times(CI,Power(Plus(a,Times(b,Power(f,Plus(c,Times(d,x))))),-1))))),x))),And(And(FreeQ(List(a,b,c,d,f),x),IntegerQ(m)),Greater(m,C0)))),
ISetDelayed(Int(Times(u_DEFAULT,Power(ArcTan(Times(c_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT))),-1))),m_DEFAULT)),x_Symbol),
    Condition(Int(Times(u,Power(ArcCot(Plus(Times(a,Power(c,-1)),Times(b,Power(x,n),Power(c,-1)))),m)),x),FreeQ(List(a,b,c,n,m),x))),
ISetDelayed(Int(Times(u_DEFAULT,Power(ArcCot(Times(c_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT))),-1))),m_DEFAULT)),x_Symbol),
    Condition(Int(Times(u,Power(ArcTan(Plus(Times(a,Power(c,-1)),Times(b,Power(x,n),Power(c,-1)))),m)),x),FreeQ(List(a,b,c,n,m),x))),
ISetDelayed(Int(Power(Times(ArcTan(Times(c_DEFAULT,x_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2))),Sqrt(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))))),-1),x_Symbol),
    Condition(Times(Power(c,-1),Log(ArcTan(Times(c,x,Power(Plus(a,Times(b,Sqr(x))),CN1D2))))),And(FreeQ(List(a,b,c),x),ZeroQ(Plus(b,Sqr(c)))))),
ISetDelayed(Int(Power(Times(ArcCot(Times(c_DEFAULT,x_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2))),Sqrt(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))))),-1),x_Symbol),
    Condition(Times(CN1,Power(c,-1),Log(ArcCot(Times(c,x,Power(Plus(a,Times(b,Sqr(x))),CN1D2))))),And(FreeQ(List(a,b,c),x),ZeroQ(Plus(b,Sqr(c)))))),
ISetDelayed(Int(Times(Power(ArcTan(Times(c_DEFAULT,x_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2))),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Times(Power(ArcTan(Times(c,x,Power(Plus(a,Times(b,Sqr(x))),CN1D2))),Plus(m,C1)),Power(Times(c,Plus(m,C1)),-1)),And(And(FreeQ(List(a,b,c,m),x),ZeroQ(Plus(b,Sqr(c)))),NonzeroQ(Plus(m,C1))))),
ISetDelayed(Int(Times(Power(ArcCot(Times(c_DEFAULT,x_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2))),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Times(CN1,Power(ArcCot(Times(c,x,Power(Plus(a,Times(b,Sqr(x))),CN1D2))),Plus(m,C1)),Power(Times(c,Plus(m,C1)),-1)),And(And(FreeQ(List(a,b,c,m),x),ZeroQ(Plus(b,Sqr(c)))),NonzeroQ(Plus(m,C1))))),
ISetDelayed(Int(Times(Power(ArcTan(Times(c_DEFAULT,x_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2))),m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Times(Sqrt(Plus(a,Times(b,Sqr(x)))),Power(Plus(d,Times(e,Sqr(x))),CN1D2),Int(Times(Power(ArcTan(Times(c,x,Power(Plus(a,Times(b,Sqr(x))),CN1D2))),m),Power(Plus(a,Times(b,Sqr(x))),CN1D2)),x)),And(And(FreeQ(List(a,b,c,d,e,m),x),ZeroQ(Plus(b,Sqr(c)))),ZeroQ(Plus(Times(b,d),Times(CN1,a,e)))))),
ISetDelayed(Int(Times(Power(ArcCot(Times(c_DEFAULT,x_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2))),m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Times(Sqrt(Plus(a,Times(b,Sqr(x)))),Power(Plus(d,Times(e,Sqr(x))),CN1D2),Int(Times(Power(ArcCot(Times(c,x,Power(Plus(a,Times(b,Sqr(x))),CN1D2))),m),Power(Plus(a,Times(b,Sqr(x))),CN1D2)),x)),And(And(FreeQ(List(a,b,c,d,e,m),x),ZeroQ(Plus(b,Sqr(c)))),ZeroQ(Plus(Times(b,d),Times(CN1,a,e)))))),
ISetDelayed(Int(Power(E,Times(n_,ArcTan(Times(a_DEFAULT,x_)))),x_Symbol),
    Condition(Int(Times(Power(Plus(C1,Times(CN1,CI,a,x)),Times(C1D2,Plus(Times(CI,n),C1))),Power(Times(Power(Plus(C1,Times(CI,a,x)),Times(C1D2,Plus(Times(CI,n),Negate(C1)))),Sqrt(Plus(C1,Times(Sqr(a),Sqr(x))))),-1)),x),And(FreeQ(a,x),OddQ(Times(CI,n))))),
ISetDelayed(Int(Times(Power(E,Times(n_,ArcTan(Times(a_DEFAULT,x_)))),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(x,m),Power(Plus(C1,Times(CN1,CI,a,x)),Times(C1D2,Plus(Times(CI,n),C1))),Power(Times(Power(Plus(C1,Times(CI,a,x)),Times(C1D2,Plus(Times(CI,n),Negate(C1)))),Sqrt(Plus(C1,Times(Sqr(a),Sqr(x))))),-1)),x),And(FreeQ(List(a,m),x),OddQ(Times(CI,n))))),
ISetDelayed(Int(Power(E,Times(n_DEFAULT,ArcTan(Times(a_DEFAULT,x_)))),x_Symbol),
    Condition(Int(Times(Power(Plus(C1,Times(CN1,CI,a,x)),Times(CI,C1D2,n)),Power(Power(Plus(C1,Times(CI,a,x)),Times(CI,C1D2,n)),-1)),x),And(FreeQ(List(a,n),x),Not(OddQ(Times(CI,n)))))),
ISetDelayed(Int(Times(Power(E,Times(n_DEFAULT,ArcTan(Times(a_DEFAULT,x_)))),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(x,m),Power(Plus(C1,Times(CN1,CI,a,x)),Times(CI,C1D2,n)),Power(Power(Plus(C1,Times(CI,a,x)),Times(CI,C1D2,n)),-1)),x),And(FreeQ(List(a,m,n),x),Not(OddQ(Times(CI,n)))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Plus(c_,Times(d_DEFAULT,x_)),p_DEFAULT),Power(E,Times(n_DEFAULT,ArcTan(Times(a_DEFAULT,x_))))),x_Symbol),
    Condition(Times(Power(c,p),Int(Times(u,Power(Plus(C1,Times(d,x,Power(c,-1))),p),Power(Plus(C1,Times(CN1,CI,a,x)),Times(CI,C1D2,n)),Power(Power(Plus(C1,Times(CI,a,x)),Times(CI,C1D2,n)),-1)),x)),And(And(FreeQ(List(a,c,d,n,p),x),ZeroQ(Plus(Times(Sqr(a),Sqr(c)),Sqr(d)))),Or(IntegerQ(p),PositiveQ(c))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Plus(c_,Times(d_DEFAULT,x_)),p_DEFAULT),Power(E,Times(n_DEFAULT,ArcTan(Times(a_DEFAULT,x_))))),x_Symbol),
    Condition(Int(Times(u,Power(Plus(c,Times(d,x)),p),Power(Plus(C1,Times(CN1,CI,a,x)),Times(CI,C1D2,n)),Power(Power(Plus(C1,Times(CI,a,x)),Times(CI,C1D2,n)),-1)),x),And(And(FreeQ(List(a,c,d,n,p),x),ZeroQ(Plus(Times(Sqr(a),Sqr(c)),Sqr(d)))),Not(Or(IntegerQ(p),PositiveQ(c)))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Plus(c_,Times(d_DEFAULT,Power(x_,-1))),p_DEFAULT),Power(E,Times(n_DEFAULT,ArcTan(Times(a_DEFAULT,x_))))),x_Symbol),
    Condition(Times(Power(d,p),Int(Times(u,Power(Power(x,p),-1),Power(Plus(C1,Times(c,x,Power(d,-1))),p),Power(E,Times(n,ArcTan(Times(a,x))))),x)),And(And(FreeQ(List(a,c,d,n),x),ZeroQ(Plus(Sqr(c),Times(Sqr(a),Sqr(d))))),IntegerQ(p)))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Plus(c_,Times(d_DEFAULT,Power(x_,-1))),p_),Power(E,Times(n_,ArcTanh(Times(a_DEFAULT,x_))))),x_Symbol),
    Condition(Times(Power(CN1,Times(C1D2,n)),Power(c,p),Int(Times(u,Power(Plus(C1,Times(d,Power(Times(c,x),-1))),p),Power(Plus(C1,Negate(Power(Times(CI,a,x),-1))),Times(CI,C1D2,n)),Power(Power(Plus(C1,Power(Times(CI,a,x),-1)),Times(CI,C1D2,n)),-1)),x)),And(And(And(And(FreeQ(List(a,c,d,p),x),ZeroQ(Plus(Sqr(c),Times(Sqr(a),Sqr(d))))),Not(IntegerQ(p))),IntegerQ(Times(CI,C1D2,n))),PositiveQ(c)))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Plus(c_,Times(d_DEFAULT,Power(x_,-1))),p_),Power(E,Times(n_,ArcTan(Times(a_DEFAULT,x_))))),x_Symbol),
    Condition(Int(Times(u,Power(Plus(c,Times(d,Power(x,-1))),p),Power(Plus(C1,Times(CN1,CI,a,x)),Times(CI,C1D2,n)),Power(Power(Plus(C1,Times(CI,a,x)),Times(CI,C1D2,n)),-1)),x),And(And(And(And(FreeQ(List(a,c,d,p),x),ZeroQ(Plus(Sqr(c),Times(Sqr(a),Sqr(d))))),Not(IntegerQ(p))),IntegerQ(Times(CI,C1D2,n))),Not(PositiveQ(c))))),
ISetDelayed(Int(Times(u_DEFAULT,Power(Plus(c_,Times(d_DEFAULT,Power(x_,-1))),p_),Power(E,Times(n_DEFAULT,ArcTan(Times(a_DEFAULT,x_))))),x_Symbol),
    Condition(Times(Power(x,p),Power(Plus(c,Times(d,Power(x,-1))),p),Power(Power(Plus(C1,Times(c,x,Power(d,-1))),p),-1),Int(Times(u,Power(Power(x,p),-1),Power(Plus(C1,Times(c,x,Power(d,-1))),p),Power(E,Times(n,ArcTan(Times(a,x))))),x)),And(And(FreeQ(List(a,c,d,n,p),x),ZeroQ(Plus(Sqr(c),Times(Sqr(a),Sqr(d))))),Not(IntegerQ(p))))),
ISetDelayed(Int(Times(Power(E,Times(n_DEFAULT,ArcTan(Times(a_DEFAULT,x_)))),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),-1)),x_Symbol),
    Condition(Times(Power(E,Times(n,ArcTan(Times(a,x)))),Power(Times(a,c,n),-1)),And(FreeQ(List(a,c,d,n),x),ZeroQ(Plus(d,Times(CN1,Sqr(a),c)))))),
ISetDelayed(Int(Times(Power(E,Times(n_,ArcTan(Times(a_DEFAULT,x_)))),Power(Plus(C1,Times(d_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Int(Power(Plus(C1,Times(CN1,a,n,x)),-1),x),And(And(FreeQ(List(a,d,n),x),ZeroQ(Plus(d,Negate(Sqr(a))))),ZeroQ(Plus(Sqr(n),C1))))),
ISetDelayed(Int(Times(Power(E,Times(n_,ArcTan(Times(a_DEFAULT,x_)))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Times(Sqrt(Plus(C1,Times(Sqr(a),Sqr(x)))),Power(Plus(c,Times(d,Sqr(x))),CN1D2),Int(Times(Power(E,Times(n,ArcTan(Times(a,x)))),Power(Plus(C1,Times(Sqr(a),Sqr(x))),CN1D2)),x)),And(And(And(FreeQ(List(a,c,d,n),x),ZeroQ(Plus(d,Times(CN1,Sqr(a),c)))),ZeroQ(Plus(Sqr(n),C1))),NonzeroQ(Plus(c,Negate(C1)))))),
ISetDelayed(Int(Times(Power(E,Times(n_DEFAULT,ArcTan(Times(a_DEFAULT,x_)))),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Times(CN1,Plus(n,Times(CN1,C2,a,p,x)),Power(Plus(c,Times(d,Sqr(x))),p),Power(E,Times(n,ArcTan(Times(a,x)))),Power(Times(C2,a,p,Plus(Times(C2,p),C1)),-1)),And(And(And(FreeQ(List(a,c,d,n,p),x),ZeroQ(Plus(d,Times(CN1,Sqr(a),c)))),ZeroQ(Plus(Sqr(n),Times(C4,Sqr(p))))),NonzeroQ(Plus(p,C1D2))))),
ISetDelayed(Int(Times(Power(E,Times(n_,ArcTan(Times(a_DEFAULT,x_)))),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),QQ(-3L,2L))),x_Symbol),
    Condition(Times(Power(c,QQ(-3L,2L)),Int(Power(Times(Plus(C1,Times(a,n,x)),Sqr(Plus(C1,Times(CN1,a,n,x)))),-1),x)),And(And(And(FreeQ(List(a,c,d),x),ZeroQ(Plus(d,Times(CN1,Sqr(a),c)))),ZeroQ(Plus(Sqr(n),C1))),PositiveQ(c)))),
ISetDelayed(Int(Times(Power(E,Times(n_,ArcTan(Times(a_DEFAULT,x_)))),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),QQ(-3L,2L))),x_Symbol),
    Condition(Times(Sqrt(Plus(C1,Times(Sqr(a),Sqr(x)))),Power(Times(c,Sqrt(Plus(c,Times(d,Sqr(x))))),-1),Int(Times(Power(E,Times(n,ArcTan(Times(a,x)))),Power(Plus(C1,Times(Sqr(a),Sqr(x))),QQ(-3L,2L))),x)),And(And(And(FreeQ(List(a,c,d),x),ZeroQ(Plus(d,Times(CN1,Sqr(a),c)))),ZeroQ(Plus(Sqr(n),C1))),Not(PositiveQ(c))))),
ISetDelayed(Int(Times(Power(E,Times(n_DEFAULT,ArcTan(Times(a_DEFAULT,x_)))),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),QQ(-3L,2L))),x_Symbol),
    Condition(Times(Plus(n,Times(a,x)),Power(E,Times(n,ArcTan(Times(a,x)))),Power(Times(a,c,Plus(Sqr(n),C1),Sqrt(Plus(c,Times(d,Sqr(x))))),-1)),And(And(And(FreeQ(List(a,c,d,n),x),ZeroQ(Plus(d,Times(CN1,Sqr(a),c)))),NonzeroQ(Plus(Sqr(n),C9))),NonzeroQ(Plus(Sqr(n),C1))))),
ISetDelayed(Int(Times(Power(E,Times(n_DEFAULT,ArcTan(Times(a_DEFAULT,x_)))),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Times(Plus(n,Times(CN1,C2,a,Plus(p,C1),x)),Power(Plus(c,Times(d,Sqr(x))),Plus(p,C1)),Power(E,Times(n,ArcTan(Times(a,x)))),Power(Times(a,c,Plus(Sqr(n),Times(C4,Sqr(Plus(p,C1))))),-1)),Times(C2,Plus(p,C1),Plus(Times(C2,p),C3),Power(Times(c,Plus(Sqr(n),Times(C4,Sqr(Plus(p,C1))))),-1),Int(Times(Power(Plus(c,Times(d,Sqr(x))),Plus(p,C1)),Power(E,Times(n,ArcTan(Times(a,x))))),x))),And(And(And(And(And(And(And(FreeQ(List(a,c,d,n),x),ZeroQ(Plus(d,Times(CN1,Sqr(a),c)))),NonzeroQ(Plus(Sqr(n),Times(C4,Sqr(p))))),RationalQ(p)),Less(p,CN1)),Unequal(p,QQ(-3L,2L))),NonzeroQ(Plus(Sqr(n),Times(C4,Sqr(Plus(p,C1)))))),IntegerQ(Times(C2,p))))),
ISetDelayed(Int(Times(Power(E,Times(n_DEFAULT,ArcTan(Times(a_DEFAULT,x_)))),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(c,p),Int(Times(Power(Plus(C1,Times(Sqr(a),Sqr(x))),Plus(p,Times(CI,C1D2,n))),Power(Power(Plus(C1,Times(CI,a,x)),Times(CI,n)),-1)),x)),And(And(And(FreeQ(List(a,c,d,p),x),ZeroQ(Plus(d,Times(CN1,Sqr(a),c)))),Or(IntegerQ(p),PositiveQ(c))),OddQ(Times(CI,n))))),
ISetDelayed(Int(Times(Power(E,Times(n_DEFAULT,ArcTan(Times(a_DEFAULT,x_)))),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(c,p),Int(Times(Power(Plus(C1,Times(CN1,CI,a,x)),Plus(p,Times(CI,C1D2,n))),Power(Plus(C1,Times(CI,a,x)),Plus(p,Times(CN1,CI,C1D2,n)))),x)),And(And(And(And(FreeQ(List(a,c,d,n,p),x),ZeroQ(Plus(d,Times(CN1,Sqr(a),c)))),Or(IntegerQ(p),PositiveQ(c))),Not(OddQ(Times(CI,n)))),Or(Or(RationalQ(Times(CI,n),p),PositiveIntegerQ(Plus(p,Times(CN1,CI,C1D2,n)))),PositiveIntegerQ(Plus(p,Times(CI,C1D2,n))))))),
ISetDelayed(Int(Times(Power(E,Times(n_,ArcTan(Times(a_DEFAULT,x_)))),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Times(Power(Power(c,Times(CI,C1D2,n)),-1),Int(Times(Power(Plus(c,Times(d,Sqr(x))),Plus(p,Times(CI,C1D2,n))),Power(Power(Plus(C1,Times(CI,a,x)),Times(CI,n)),-1)),x)),And(And(And(And(FreeQ(List(a,c,d,n,p),x),ZeroQ(Plus(d,Times(CN1,Sqr(a),c)))),Not(Or(IntegerQ(p),PositiveQ(c)))),EvenQ(Times(CI,n))),RationalQ(p)))),
ISetDelayed(Int(Times(Power(E,Times(n_,ArcTan(Times(a_DEFAULT,x_)))),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Times(Power(c,Plus(p,Negate(C1D2))),Sqrt(Plus(c,Times(d,Sqr(x)))),Power(Plus(C1,Times(Sqr(a),Sqr(x))),CN1D2),Int(Times(Power(Plus(C1,Times(Sqr(a),Sqr(x))),p),Power(E,Times(n,ArcTan(Times(a,x))))),x)),And(And(And(And(FreeQ(List(a,c,d,n,p),x),ZeroQ(Plus(d,Times(CN1,Sqr(a),c)))),Not(PositiveQ(c))),PositiveIntegerQ(Plus(p,C1D2))),RationalQ(Times(CI,n))))),
ISetDelayed(Int(Times(Power(E,Times(n_,ArcTan(Times(a_DEFAULT,x_)))),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Times(Power(c,Plus(p,C1D2)),Sqrt(Plus(C1,Times(Sqr(a),Sqr(x)))),Power(Plus(c,Times(d,Sqr(x))),CN1D2),Int(Times(Power(Plus(C1,Times(Sqr(a),Sqr(x))),p),Power(E,Times(n,ArcTan(Times(a,x))))),x)),And(And(And(And(FreeQ(List(a,c,d,n,p),x),ZeroQ(Plus(d,Times(CN1,Sqr(a),c)))),Not(PositiveQ(c))),NegativeIntegerQ(Plus(p,Negate(C1D2)))),RationalQ(Times(CI,n))))),
ISetDelayed(Int(Times(Power(E,Times(n_DEFAULT,ArcTan(Times(a_DEFAULT,x_)))),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Times(Power(Plus(c,Times(d,Sqr(x))),p),Power(Power(Plus(C1,Times(Sqr(a),Sqr(x))),p),-1),Int(Times(Power(Plus(C1,Times(Sqr(a),Sqr(x))),p),Power(E,Times(n,ArcTan(Times(a,x))))),x)),And(And(And(And(FreeQ(List(a,c,d,n,p),x),ZeroQ(Plus(d,Times(CN1,Sqr(a),c)))),Not(Or(IntegerQ(p),PositiveQ(c)))),Not(IntegerQ(Plus(p,C1D2)))),Or(Or(RationalQ(n,p),PositiveIntegerQ(Plus(p,Times(CN1,C1D2,n)))),PositiveIntegerQ(Plus(p,Times(C1D2,n))))))),
ISetDelayed(Int(Times(Power(E,Times(n_DEFAULT,ArcTan(Times(a_DEFAULT,x_)))),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(Plus(c,Times(Sqr(a),c,Sqr(x))),Plus(p,C1)),Power(E,Times(n,ArcTan(Times(a,x)))),Power(Times(C2,a,c,n),-1),Power(Plus(C1,Power(E,Times(n,Power(Plus(p,C1),-1),ArcTan(Times(a,x))))),Times(C2,Plus(p,C1))),Hypergeometric2F1(Times(C2,Plus(p,C1)),Times(C2,Plus(p,C1)),Plus(Times(C2,p),C3),Negate(Power(E,Times(n,Power(Plus(p,C1),-1),ArcTan(Times(a,x))))))),And(And(And(FreeQ(List(a,c,d,n,p),x),ZeroQ(Plus(d,Times(CN1,Sqr(a),c)))),ZeroQ(Plus(Sqr(n),Times(C4,Sqr(Plus(p,C1)))))),Not(IntegerQ(Times(C2,p)))))),
ISetDelayed(Int(Times(Power(E,Times(n_DEFAULT,ArcTan(Times(a_DEFAULT,x_)))),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(C4,Plus(p,C1)),Power(Plus(c,Times(d,Sqr(x))),Plus(p,C1)),Power(E,Times(n,ArcTan(Times(a,x)))),Power(Times(a,c,Plus(n,Times(C2,CI,Plus(p,C1)))),-1),Power(Power(Plus(C1,Times(CN1,CI,a,x)),-1),Times(C2,Plus(p,C1))),Hypergeometric2F1(Plus(p,Times(CN1,CI,C1D2,n),C1),Times(C2,Plus(p,C1)),Plus(p,Times(CN1,CI,C1D2,n),C2),Negate(Power(E,Times(C2,CI,ArcTan(Times(a,x))))))),And(And(And(And(FreeQ(List(a,c,d,n,p),x),ZeroQ(Plus(d,Times(CN1,Sqr(a),c)))),NonzeroQ(Plus(Sqr(n),Times(C4,Sqr(Plus(p,C1)))))),Not(NegativeIntegerQ(Plus(Times(C2,p),C1)))),Not(IntegerQ(Plus(p,Times(CN1,CI,C1D2,n))))))),
ISetDelayed(Int(Times(x_,Power(E,Times(n_DEFAULT,ArcTan(Times(a_DEFAULT,x_)))),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),QQ(-3L,2L))),x_Symbol),
    Condition(Times(CN1,Plus(C1,Times(CN1,a,n,x)),Power(E,Times(n,ArcTan(Times(a,x)))),Power(Times(Sqr(a),c,Plus(Sqr(n),C1),Sqrt(Plus(c,Times(d,Sqr(x))))),-1)),And(And(FreeQ(List(a,c,d,n),x),ZeroQ(Plus(d,Times(CN1,Sqr(a),c)))),Not(OddQ(Times(CI,n)))))),
ISetDelayed(Int(Times(x_,Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),p_),Power(E,Times(n_DEFAULT,ArcTan(Times(a_DEFAULT,x_))))),x_Symbol),
    Condition(Plus(Times(Plus(Times(C2,Plus(p,C1)),Times(a,n,x)),Power(Plus(c,Times(d,Sqr(x))),Plus(p,C1)),Power(E,Times(n,ArcTan(Times(a,x)))),Power(Times(Sqr(a),c,Plus(Sqr(n),Times(C4,Sqr(Plus(p,C1))))),-1)),Times(CN1,n,Plus(Times(C2,p),C3),Power(Times(a,c,Plus(Sqr(n),Times(C4,Sqr(Plus(p,C1))))),-1),Int(Times(Power(Plus(c,Times(d,Sqr(x))),Plus(p,C1)),Power(E,Times(n,ArcTan(Times(a,x))))),x))),And(And(And(And(And(And(FreeQ(List(a,c,d,n),x),ZeroQ(Plus(d,Times(CN1,Sqr(a),c)))),RationalQ(p)),LessEqual(p,CN1)),Unequal(p,QQ(-3L,2L))),NonzeroQ(Plus(Sqr(n),Times(C4,Sqr(Plus(p,C1)))))),Not(OddQ(Times(CI,n)))))),
ISetDelayed(Int(Times(Sqr(x_),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),p_DEFAULT),Power(E,Times(n_DEFAULT,ArcTan(Times(a_DEFAULT,x_))))),x_Symbol),
    Condition(Times(CN1,Plus(n,Times(CN1,C2,Plus(p,C1),a,x)),Power(Plus(c,Times(d,Sqr(x))),Plus(p,C1)),Power(E,Times(n,ArcTan(Times(a,x)))),Power(Times(Power(a,3),c,Sqr(n),Plus(Sqr(n),C1)),-1)),And(And(And(FreeQ(List(a,c,d,n),x),ZeroQ(Plus(d,Times(CN1,Sqr(a),c)))),ZeroQ(Plus(Sqr(n),Times(CN1,C2,Plus(p,C1))))),NonzeroQ(Plus(Sqr(n),C1))))),
ISetDelayed(Int(Times(Sqr(x_),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),p_),Power(E,Times(n_DEFAULT,ArcTan(Times(a_DEFAULT,x_))))),x_Symbol),
    Condition(Plus(Times(CN1,Plus(n,Times(CN1,C2,Plus(p,C1),a,x)),Power(Plus(c,Times(d,Sqr(x))),Plus(p,C1)),Power(E,Times(n,ArcTan(Times(a,x)))),Power(Times(Power(a,3),c,Plus(Sqr(n),Times(C4,Sqr(Plus(p,C1))))),-1)),Times(Plus(Sqr(n),Times(CN1,C2,Plus(p,C1))),Power(Times(Sqr(a),c,Plus(Sqr(n),Times(C4,Sqr(Plus(p,C1))))),-1),Int(Times(Power(Plus(c,Times(d,Sqr(x))),Plus(p,C1)),Power(E,Times(n,ArcTan(Times(a,x))))),x))),And(And(And(And(And(And(FreeQ(List(a,c,d,n),x),ZeroQ(Plus(d,Times(CN1,Sqr(a),c)))),RationalQ(p)),LessEqual(p,CN1)),NonzeroQ(Plus(Sqr(n),Times(CN1,C2,Plus(p,C1))))),NonzeroQ(Plus(Sqr(n),Times(C4,Sqr(Plus(p,C1)))))),Not(OddQ(Times(CI,n)))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),p_),Power(E,Times(n_DEFAULT,ArcTan(Times(a_DEFAULT,x_))))),x_Symbol),
    Condition(Times(Power(c,p),Power(Power(a,Plus(m,C1)),-1),Subst(Int(Times(Power(E,Times(n,x)),Power(Tan(x),Plus(m,Times(C2,Plus(p,C1)))),Power(Power(Sin(x),Times(C2,Plus(p,C1))),-1)),x),x,ArcTan(Times(a,x)))),And(And(And(And(And(And(FreeQ(List(a,c,d,n),x),ZeroQ(Plus(d,Times(CN1,Sqr(a),c)))),IntegerQ(m)),RationalQ(p)),LessEqual(LessEqual(C3,m),Times(CN2,Plus(p,C1)))),IntegerQ(Times(C2,p))),Or(IntegerQ(p),PositiveQ(c))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),p_DEFAULT),Power(E,Times(n_DEFAULT,ArcTan(Times(a_DEFAULT,x_))))),x_Symbol),
    Condition(Times(Power(c,p),Int(Times(Power(x,m),Power(Plus(C1,Times(Sqr(a),Sqr(x))),Plus(p,Times(CI,C1D2,n))),Power(Power(Plus(C1,Times(CI,a,x)),Times(CI,n)),-1)),x)),And(And(And(And(FreeQ(List(a,c,d,m,n,p),x),ZeroQ(Plus(d,Times(CN1,Sqr(a),c)))),Or(IntegerQ(p),PositiveQ(c))),OddQ(Times(CI,n))),Or(Or(Not(RationalQ(p)),Not(RationalQ(m))),And(ZeroQ(Plus(Times(CI,n),Negate(C1))),NonzeroQ(Plus(p,C1))))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),p_),Power(E,Times(n_,ArcTan(Times(a_DEFAULT,x_))))),x_Symbol),
    Condition(Times(Power(Power(c,Times(CI,C1D2,n)),-1),Int(Times(Power(x,m),Power(Plus(c,Times(d,Sqr(x))),Plus(p,Times(CI,C1D2,n))),Power(Power(Plus(C1,Times(a,x)),Times(CI,n)),-1)),x)),And(And(And(And(FreeQ(List(a,c,d,m,n,p),x),ZeroQ(Plus(d,Times(CN1,Sqr(a),c)))),Not(Or(IntegerQ(p),PositiveQ(c)))),IntegerQ(Times(CI,C1D2,n))),Or(ZeroQ(Plus(m,Negate(C1))),Not(IntegerQ(Plus(p,C1D2))))))),
ISetDelayed(Int(Times(u_,Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),p_DEFAULT),Power(E,Times(n_DEFAULT,ArcTan(Times(a_DEFAULT,x_))))),x_Symbol),
    Condition(Times(Power(c,p),Int(Times(u,Power(Plus(C1,Times(CN1,CI,a,x)),Plus(p,Times(CI,C1D2,n))),Power(Plus(C1,Times(CI,a,x)),Plus(p,Times(CN1,CI,C1D2,n)))),x)),And(And(FreeQ(List(a,c,d,n,p),x),ZeroQ(Plus(d,Times(CN1,Sqr(a),c)))),Or(IntegerQ(p),PositiveQ(c))))),
ISetDelayed(Int(Times(u_,Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),p_),Power(E,Times(n_,ArcTan(Times(a_DEFAULT,x_))))),x_Symbol),
    Condition(Times(Power(c,Plus(p,Negate(C1D2))),Sqrt(Plus(c,Times(d,Sqr(x)))),Power(Times(Sqrt(Plus(C1,Times(CN1,CI,a,x))),Sqrt(Plus(C1,Times(CI,a,x)))),-1),Int(Times(u,Power(Plus(C1,Times(CN1,CI,a,x)),Plus(p,Times(CI,C1D2,n))),Power(Plus(C1,Times(CI,a,x)),Plus(p,Times(CN1,CI,C1D2,n)))),x)),And(And(And(And(FreeQ(List(a,c,d,n,p),x),ZeroQ(Plus(d,Times(CN1,Sqr(a),c)))),Not(PositiveQ(c))),IntegerQ(Times(CI,C1D2,n))),PositiveIntegerQ(Plus(p,C1D2))))),
ISetDelayed(Int(Times(u_,Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),p_),Power(E,Times(n_,ArcTan(Times(a_DEFAULT,x_))))),x_Symbol),
    Condition(Times(Power(c,Plus(p,C1D2)),Sqrt(Plus(C1,Times(CN1,CI,a,x))),Sqrt(Plus(C1,Times(CI,a,x))),Power(Plus(c,Times(d,Sqr(x))),CN1D2),Int(Times(u,Power(Plus(C1,Times(CN1,CI,a,x)),Plus(p,Times(CI,C1D2,n))),Power(Plus(C1,Times(CI,a,x)),Plus(p,Times(CN1,CI,C1D2,n)))),x)),And(And(And(And(FreeQ(List(a,c,d,n,p),x),ZeroQ(Plus(d,Times(CN1,Sqr(a),c)))),Not(PositiveQ(c))),IntegerQ(Times(CI,C1D2,n))),NegativeIntegerQ(Plus(p,Negate(C1D2)))))),
ISetDelayed(Int(Times(u_,Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),p_),Power(E,Times(n_DEFAULT,ArcTan(Times(a_DEFAULT,x_))))),x_Symbol),
    Condition(Times(Power(c,Plus(p,Negate(C1D2))),Sqrt(Plus(c,Times(d,Sqr(x)))),Power(Plus(C1,Times(Sqr(a),Sqr(x))),CN1D2),Int(Times(u,Power(Plus(C1,Times(Sqr(a),Sqr(x))),p),Power(E,Times(n,ArcTan(Times(a,x))))),x)),And(And(And(And(FreeQ(List(a,c,d,n,p),x),ZeroQ(Plus(d,Times(CN1,Sqr(a),c)))),Not(PositiveQ(c))),Not(IntegerQ(Times(CI,C1D2,n)))),PositiveIntegerQ(Plus(p,C1D2))))),
ISetDelayed(Int(Times(u_,Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),p_),Power(E,Times(n_DEFAULT,ArcTan(Times(a_DEFAULT,x_))))),x_Symbol),
    Condition(Times(Power(c,Plus(p,C1D2)),Sqrt(Plus(C1,Times(Sqr(a),Sqr(x)))),Power(Plus(c,Times(d,Sqr(x))),CN1D2),Int(Times(u,Power(Plus(C1,Times(Sqr(a),Sqr(x))),p),Power(E,Times(n,ArcTan(Times(a,x))))),x)),And(And(And(And(FreeQ(List(a,c,d,n,p),x),ZeroQ(Plus(d,Times(CN1,Sqr(a),c)))),Not(PositiveQ(c))),Not(IntegerQ(Times(CI,C1D2,n)))),NegativeIntegerQ(Plus(p,Negate(C1D2))))))
  );
}