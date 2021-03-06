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
public class IntRules136 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Power(Times(c_DEFAULT,ProductLog(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),p_),x_Symbol),
    Condition(Plus(Times(Plus(a,Times(b,x)),Power(Times(c,ProductLog(Plus(a,Times(b,x)))),p),Power(Times(b,Plus(p,C1)),-1)),Times(p,Power(Times(c,Plus(p,C1)),-1),Int(Times(Power(Times(c,ProductLog(Plus(a,Times(b,x)))),Plus(p,C1)),Power(Plus(C1,ProductLog(Plus(a,Times(b,x)))),-1)),x))),And(And(FreeQ(List(a,b,c),x),RationalQ(p)),Less(p,CN1)))),
ISetDelayed(Int(Power(Times(c_DEFAULT,ProductLog(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),p_DEFAULT),x_Symbol),
    Condition(Plus(Times(Plus(a,Times(b,x)),Power(Times(c,ProductLog(Plus(a,Times(b,x)))),p),Power(b,-1)),Times(CN1,p,Int(Times(Power(Times(c,ProductLog(Plus(a,Times(b,x)))),p),Power(Plus(C1,ProductLog(Plus(a,Times(b,x)))),-1)),x))),And(FreeQ(List(a,b,c),x),Not(And(RationalQ(p),Less(p,CN1)))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Times(c_DEFAULT,ProductLog(Plus(a_,Times(b_DEFAULT,x_)))),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(b,-1),Subst(Int(ExpandIntegrand(Power(Times(c,ProductLog(x)),p),Power(Plus(Times(CN1,a,Power(b,-1)),Times(x,Power(b,-1))),m),x),x),x,Plus(a,Times(b,x)))),And(FreeQ(List(a,b,c,p),x),PositiveIntegerQ(m)))),
ISetDelayed(Int(Power(Times(c_DEFAULT,ProductLog(Times(a_DEFAULT,Power(x_,n_)))),p_DEFAULT),x_Symbol),
    Condition(Plus(Times(x,Power(Times(c,ProductLog(Times(a,Power(x,n)))),p)),Times(CN1,n,p,Int(Times(Power(Times(c,ProductLog(Times(a,Power(x,n)))),p),Power(Plus(C1,ProductLog(Times(a,Power(x,n)))),-1)),x))),And(FreeQ(List(a,c,n,p),x),Or(ZeroQ(Plus(Times(n,Plus(p,Negate(C1))),C1)),And(IntegerQ(Plus(p,Negate(C1D2))),ZeroQ(Plus(Times(n,Plus(p,Negate(C1D2))),C1))))))),
ISetDelayed(Int(Power(Times(c_DEFAULT,ProductLog(Times(a_DEFAULT,Power(x_,n_)))),p_DEFAULT),x_Symbol),
    Condition(Plus(Times(x,Power(Times(c,ProductLog(Times(a,Power(x,n)))),p),Power(Plus(Times(n,p),C1),-1)),Times(n,p,Power(Times(c,Plus(Times(n,p),C1)),-1),Int(Times(Power(Times(c,ProductLog(Times(a,Power(x,n)))),Plus(p,C1)),Power(Plus(C1,ProductLog(Times(a,Power(x,n)))),-1)),x))),And(FreeQ(List(a,c,n),x),Or(And(IntegerQ(p),ZeroQ(Plus(Times(n,Plus(p,C1)),C1))),And(IntegerQ(Plus(p,Negate(C1D2))),ZeroQ(Plus(Times(n,Plus(p,C1D2)),C1))))))),
ISetDelayed(Int(Power(Times(c_DEFAULT,ProductLog(Times(a_DEFAULT,Power(x_,n_)))),p_DEFAULT),x_Symbol),
    Condition(Negate(Subst(Int(Times(Power(Times(c,ProductLog(Times(a,Power(x,Negate(n))))),p),Power(x,-2)),x),x,Power(x,-1))),And(FreeQ(List(a,c,p),x),NegativeIntegerQ(n)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Times(c_DEFAULT,ProductLog(Times(a_DEFAULT,Power(x_,n_DEFAULT)))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Times(c,ProductLog(Times(a,Power(x,n)))),p),Power(Plus(m,C1),-1)),Times(CN1,n,p,Power(Plus(m,C1),-1),Int(Times(Power(x,m),Power(Times(c,ProductLog(Times(a,Power(x,n)))),p),Power(Plus(C1,ProductLog(Times(a,Power(x,n)))),-1)),x))),And(And(FreeQ(List(a,c,m,n,p),x),NonzeroQ(Plus(m,C1))),Or(And(And(IntegerQ(Plus(p,Negate(C1D2))),IntegerQ(Times(C2,Simplify(Plus(p,Times(Plus(m,C1),Power(n,-1))))))),Greater(Simplify(Plus(p,Times(Plus(m,C1),Power(n,-1)))),C0)),And(And(Not(IntegerQ(Plus(p,Negate(C1D2)))),IntegerQ(Simplify(Plus(p,Times(Plus(m,C1),Power(n,-1)))))),GreaterEqual(Simplify(Plus(p,Times(Plus(m,C1),Power(n,-1)))),C0)))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Times(c_DEFAULT,ProductLog(Times(a_DEFAULT,Power(x_,n_DEFAULT)))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Times(c,ProductLog(Times(a,Power(x,n)))),p),Power(Plus(m,Times(n,p),C1),-1)),Times(n,p,Power(Times(c,Plus(m,Times(n,p),C1)),-1),Int(Times(Power(x,m),Power(Times(c,ProductLog(Times(a,Power(x,n)))),Plus(p,C1)),Power(Plus(C1,ProductLog(Times(a,Power(x,n)))),-1)),x))),And(FreeQ(List(a,c,m,n,p),x),Or(Or(ZeroQ(Plus(m,C1)),And(And(IntegerQ(Plus(p,Negate(C1D2))),IntegerQ(Plus(Simplify(Plus(p,Times(Plus(m,C1),Power(n,-1)))),Negate(C1D2)))),Less(Simplify(Plus(p,Times(Plus(m,C1),Power(n,-1)))),C0))),And(And(Not(IntegerQ(Plus(p,Negate(C1D2)))),IntegerQ(Simplify(Plus(p,Times(Plus(m,C1),Power(n,-1)))))),Less(Simplify(Plus(p,Times(Plus(m,C1),Power(n,-1)))),C0)))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Times(c_DEFAULT,ProductLog(Times(a_DEFAULT,x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Int(Times(Power(x,m),Power(Times(c,ProductLog(Times(a,x))),p),Power(Plus(C1,ProductLog(Times(a,x))),-1)),x),Times(Power(c,-1),Int(Times(Power(x,m),Power(Times(c,ProductLog(Times(a,x))),Plus(p,C1)),Power(Plus(C1,ProductLog(Times(a,x))),-1)),x))),FreeQ(List(a,c,m),x))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Times(c_DEFAULT,ProductLog(Times(a_DEFAULT,Power(x_,n_)))),p_DEFAULT)),x_Symbol),
    Condition(Negate(Subst(Int(Times(Power(Times(c,ProductLog(Times(a,Power(x,Negate(n))))),p),Power(Power(x,Plus(m,C2)),-1)),x),x,Power(x,-1))),And(And(And(FreeQ(List(a,c,p),x),IntegersQ(m,n)),Less(n,C0)),NonzeroQ(Plus(m,C1))))),
ISetDelayed(Int(Power(Plus(d_,Times(d_DEFAULT,ProductLog(Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),-1),x_Symbol),
    Condition(Times(Plus(a,Times(b,x)),Power(Times(b,d,ProductLog(Plus(a,Times(b,x)))),-1)),FreeQ(List(a,b,d),x))),
ISetDelayed(Int(Times(Power(Plus(d_,Times(d_DEFAULT,ProductLog(Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),-1),ProductLog(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Times(d,x),Negate(Int(Power(Plus(d,Times(d,ProductLog(Plus(a,Times(b,x))))),-1),x))),FreeQ(List(a,b,d),x))),
ISetDelayed(Int(Times(Power(Plus(d_,Times(d_DEFAULT,ProductLog(Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),-1),Power(Times(c_DEFAULT,ProductLog(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Times(c,Plus(a,Times(b,x)),Power(Times(c,ProductLog(Plus(a,Times(b,x)))),Plus(p,Negate(C1))),Power(Times(b,d),-1)),Times(CN1,c,p,Int(Times(Power(Times(c,ProductLog(Plus(a,Times(b,x)))),Plus(p,Negate(C1))),Power(Plus(d,Times(d,ProductLog(Plus(a,Times(b,x))))),-1)),x))),And(And(FreeQ(List(a,b,c,d),x),RationalQ(p)),Greater(p,C0)))),
ISetDelayed(Int(Power(Times(Plus(d_,Times(d_DEFAULT,ProductLog(Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),ProductLog(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),-1),x_Symbol),
    Condition(Times(ExpIntegralEi(ProductLog(Plus(a,Times(b,x)))),Power(Times(b,d),-1)),FreeQ(List(a,b,d),x))),
ISetDelayed(Int(Power(Times(Plus(d_,Times(d_DEFAULT,ProductLog(Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),Sqrt(Times(c_DEFAULT,ProductLog(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),-1),x_Symbol),
    Condition(Times(Rt(Times(Pi,c),C2),Erfi(Times(Sqrt(Times(c,ProductLog(Plus(a,Times(b,x))))),Power(Rt(c,C2),-1))),Power(Times(b,c,d),-1)),And(FreeQ(List(a,b,c,d),x),PosQ(c)))),
ISetDelayed(Int(Power(Times(Plus(d_,Times(d_DEFAULT,ProductLog(Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),Sqrt(Times(c_DEFAULT,ProductLog(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))))),-1),x_Symbol),
    Condition(Times(Rt(Times(CN1,Pi,c),C2),Erf(Times(Sqrt(Times(c,ProductLog(Plus(a,Times(b,x))))),Power(Rt(Negate(c),C2),-1))),Power(Times(b,c,d),-1)),And(FreeQ(List(a,b,c,d),x),NegQ(c)))),
ISetDelayed(Int(Times(Power(Plus(d_,Times(d_DEFAULT,ProductLog(Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),-1),Power(Times(c_DEFAULT,ProductLog(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Plus(Times(Plus(a,Times(b,x)),Power(Times(c,ProductLog(Plus(a,Times(b,x)))),p),Power(Times(b,d,Plus(p,C1)),-1)),Times(CN1,Power(Times(c,Plus(p,C1)),-1),Int(Times(Power(Times(c,ProductLog(Plus(a,Times(b,x)))),Plus(p,C1)),Power(Plus(d,Times(d,ProductLog(Plus(a,Times(b,x))))),-1)),x))),And(And(FreeQ(List(a,b,c,d),x),RationalQ(p)),Less(p,CN1)))),
ISetDelayed(Int(Times(Power(Plus(d_,Times(d_DEFAULT,ProductLog(Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),-1),Power(Times(c_DEFAULT,ProductLog(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),p_DEFAULT)),x_Symbol),
    Condition(Times(Gamma(Plus(p,C1),Negate(ProductLog(Plus(a,Times(b,x))))),Power(Times(c,ProductLog(Plus(a,Times(b,x)))),p),Power(Times(b,d,Power(Negate(ProductLog(Plus(a,Times(b,x)))),p)),-1)),FreeQ(List(a,b,c,d,p),x))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(d_DEFAULT,ProductLog(Plus(a_,Times(b_DEFAULT,x_))))),-1)),x_Symbol),
    Condition(Times(Power(b,-1),Subst(Int(ExpandIntegrand(Power(Plus(d,Times(d,ProductLog(x))),-1),Power(Plus(Times(CN1,a,Power(b,-1)),Times(x,Power(b,-1))),m),x),x),x,Plus(a,Times(b,x)))),And(FreeQ(List(a,b,d),x),PositiveIntegerQ(m)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(d_DEFAULT,ProductLog(Plus(a_,Times(b_DEFAULT,x_))))),-1),Power(Times(c_DEFAULT,ProductLog(Plus(a_,Times(b_DEFAULT,x_)))),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(b,-1),Subst(Int(ExpandIntegrand(Times(Power(Times(c,ProductLog(x)),p),Power(Plus(d,Times(d,ProductLog(x))),-1)),Power(Plus(Times(CN1,a,Power(b,-1)),Times(x,Power(b,-1))),m),x),x),x,Plus(a,Times(b,x)))),And(FreeQ(List(a,b,c,d,p),x),PositiveIntegerQ(m)))),
ISetDelayed(Int(Power(Plus(d_,Times(d_DEFAULT,ProductLog(Times(a_DEFAULT,Power(x_,n_))))),-1),x_Symbol),
    Condition(Negate(Subst(Int(Power(Times(Sqr(x),Plus(d,Times(d,ProductLog(Times(a,Power(x,Negate(n))))))),-1),x),x,Power(x,-1))),And(FreeQ(List(a,d),x),NegativeIntegerQ(n)))),
ISetDelayed(Int(Times(Power(Plus(d_,Times(d_DEFAULT,ProductLog(Times(a_DEFAULT,Power(x_,n_DEFAULT))))),-1),Power(Times(c_DEFAULT,ProductLog(Times(a_DEFAULT,Power(x_,n_DEFAULT)))),p_DEFAULT)),x_Symbol),
    Condition(Times(c,x,Power(Times(c,ProductLog(Times(a,Power(x,n)))),Plus(p,Negate(C1))),Power(d,-1)),And(FreeQ(List(a,c,d,n,p),x),ZeroQ(Plus(Times(n,Plus(p,Negate(C1))),C1))))),
ISetDelayed(Int(Times(Power(Plus(d_,Times(d_DEFAULT,ProductLog(Times(a_DEFAULT,Power(x_,n_DEFAULT))))),-1),Power(ProductLog(Times(a_DEFAULT,Power(x_,n_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(a,p),ExpIntegralEi(Times(CN1,p,ProductLog(Times(a,Power(x,n))))),Power(Times(d,n),-1)),And(And(FreeQ(List(a,d),x),IntegerQ(Power(n,-1))),ZeroQ(Plus(p,Power(n,-1)))))),
ISetDelayed(Int(Times(Power(Plus(d_,Times(d_DEFAULT,ProductLog(Times(a_DEFAULT,Power(x_,n_DEFAULT))))),-1),Power(Times(c_DEFAULT,ProductLog(Times(a_DEFAULT,Power(x_,n_DEFAULT)))),p_)),x_Symbol),
    Condition(Times(Rt(Times(Pi,c,n),C2),Power(Times(d,n,Power(a,Power(n,-1)),Power(c,Power(n,-1))),-1),Erfi(Times(Sqrt(Times(c,ProductLog(Times(a,Power(x,n))))),Power(Rt(Times(c,n),C2),-1)))),And(And(And(FreeQ(List(a,c,d),x),IntegerQ(Power(n,-1))),ZeroQ(Plus(p,Negate(C1D2),Power(n,-1)))),PosQ(Times(c,n))))),
ISetDelayed(Int(Times(Power(Plus(d_,Times(d_DEFAULT,ProductLog(Times(a_DEFAULT,Power(x_,n_DEFAULT))))),-1),Power(Times(c_DEFAULT,ProductLog(Times(a_DEFAULT,Power(x_,n_DEFAULT)))),p_)),x_Symbol),
    Condition(Times(Rt(Times(CN1,Pi,c,n),C2),Power(Times(d,n,Power(a,Power(n,-1)),Power(c,Power(n,-1))),-1),Erf(Times(Sqrt(Times(c,ProductLog(Times(a,Power(x,n))))),Power(Rt(Times(CN1,c,n),C2),-1)))),And(And(And(FreeQ(List(a,c,d),x),IntegerQ(Power(n,-1))),ZeroQ(Plus(p,Negate(C1D2),Power(n,-1)))),NegQ(Times(c,n))))),
ISetDelayed(Int(Times(Power(Plus(d_,Times(d_DEFAULT,ProductLog(Times(a_DEFAULT,Power(x_,n_DEFAULT))))),-1),Power(Times(c_DEFAULT,ProductLog(Times(a_DEFAULT,Power(x_,n_DEFAULT)))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(c,x,Power(Times(c,ProductLog(Times(a,Power(x,n)))),Plus(p,Negate(C1))),Power(d,-1)),Times(CN1,c,Plus(Times(n,Plus(p,Negate(C1))),C1),Int(Times(Power(Times(c,ProductLog(Times(a,Power(x,n)))),Plus(p,Negate(C1))),Power(Plus(d,Times(d,ProductLog(Times(a,Power(x,n))))),-1)),x))),And(And(And(FreeQ(List(a,c,d),x),RationalQ(n,p)),Greater(n,C0)),Greater(Plus(Times(n,Plus(p,Negate(C1))),C1),C0)))),
ISetDelayed(Int(Times(Power(Plus(d_,Times(d_DEFAULT,ProductLog(Times(a_DEFAULT,Power(x_,n_DEFAULT))))),-1),Power(Times(c_DEFAULT,ProductLog(Times(a_DEFAULT,Power(x_,n_DEFAULT)))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(x,Power(Times(c,ProductLog(Times(a,Power(x,n)))),p),Power(Times(d,Plus(Times(n,p),C1)),-1)),Times(CN1,Power(Times(c,Plus(Times(n,p),C1)),-1),Int(Times(Power(Times(c,ProductLog(Times(a,Power(x,n)))),Plus(p,C1)),Power(Plus(d,Times(d,ProductLog(Times(a,Power(x,n))))),-1)),x))),And(And(And(FreeQ(List(a,c,d),x),RationalQ(n,p)),Greater(n,C0)),Less(Plus(Times(n,p),C1),C0)))),
ISetDelayed(Int(Times(Power(Plus(d_,Times(d_DEFAULT,ProductLog(Times(a_DEFAULT,Power(x_,n_))))),-1),Power(Times(c_DEFAULT,ProductLog(Times(a_DEFAULT,Power(x_,n_)))),p_DEFAULT)),x_Symbol),
    Condition(Negate(Subst(Int(Times(Power(Times(c,ProductLog(Times(a,Power(x,Negate(n))))),p),Power(Times(Sqr(x),Plus(d,Times(d,ProductLog(Times(a,Power(x,Negate(n))))))),-1)),x),x,Power(x,-1))),And(FreeQ(List(a,c,d,p),x),NegativeIntegerQ(n)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(d_DEFAULT,ProductLog(Times(a_DEFAULT,x_)))),-1)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Times(d,Plus(m,C1),ProductLog(Times(a,x))),-1)),Times(CN1,m,Power(Plus(m,C1),-1),Int(Times(Power(x,m),Power(Times(ProductLog(Times(a,x)),Plus(d,Times(d,ProductLog(Times(a,x))))),-1)),x))),And(And(FreeQ(List(a,d),x),RationalQ(m)),Greater(m,C0)))),
ISetDelayed(Int(Power(Times(x_,Plus(d_,Times(d_DEFAULT,ProductLog(Times(a_DEFAULT,x_))))),-1),x_Symbol),
    Condition(Times(Log(ProductLog(Times(a,x))),Power(d,-1)),FreeQ(List(a,d),x))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(d_DEFAULT,ProductLog(Times(a_DEFAULT,x_)))),-1)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Times(d,Plus(m,C1)),-1)),Negate(Int(Times(Power(x,m),ProductLog(Times(a,x)),Power(Plus(d,Times(d,ProductLog(Times(a,x)))),-1)),x))),And(And(FreeQ(List(a,d),x),RationalQ(m)),Less(m,CN1)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(d_DEFAULT,ProductLog(Times(a_DEFAULT,x_)))),-1)),x_Symbol),
    Condition(Times(Power(x,m),Gamma(Plus(m,C1),Times(CN1,Plus(m,C1),ProductLog(Times(a,x)))),Power(Times(a,d,Plus(m,C1),Power(E,Times(m,ProductLog(Times(a,x)))),Power(Times(CN1,Plus(m,C1),ProductLog(Times(a,x))),m)),-1)),And(FreeQ(List(a,d,m),x),Not(IntegerQ(m))))),
ISetDelayed(Int(Power(Times(x_,Plus(d_,Times(d_DEFAULT,ProductLog(Times(a_DEFAULT,Power(x_,n_DEFAULT)))))),-1),x_Symbol),
    Condition(Times(Log(ProductLog(Times(a,Power(x,n)))),Power(Times(d,n),-1)),FreeQ(List(a,d,n),x))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(d_DEFAULT,ProductLog(Times(a_DEFAULT,Power(x_,n_))))),-1)),x_Symbol),
    Condition(Negate(Subst(Int(Power(Times(Power(x,Plus(m,C2)),Plus(d,Times(d,ProductLog(Times(a,Power(x,Negate(n))))))),-1),x),x,Power(x,-1))),And(And(And(FreeQ(List(a,d),x),IntegersQ(m,n)),Less(n,C0)),NonzeroQ(Plus(m,C1))))),
ISetDelayed(Int(Times(Power(Times(x_,Plus(d_,Times(d_DEFAULT,ProductLog(Times(a_DEFAULT,Power(x_,n_DEFAULT)))))),-1),Power(Times(c_DEFAULT,ProductLog(Times(a_DEFAULT,Power(x_,n_DEFAULT)))),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(Times(c,ProductLog(Times(a,Power(x,n)))),p),Power(Times(d,n,p),-1)),FreeQ(List(a,c,d,n,p),x))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(d_DEFAULT,ProductLog(Times(a_DEFAULT,Power(x_,n_DEFAULT))))),-1),Power(Times(c_DEFAULT,ProductLog(Times(a_DEFAULT,Power(x_,n_DEFAULT)))),p_DEFAULT)),x_Symbol),
    Condition(Times(c,Power(x,Plus(m,C1)),Power(Times(c,ProductLog(Times(a,Power(x,n)))),Plus(p,Negate(C1))),Power(Times(d,Plus(m,C1)),-1)),And(And(FreeQ(List(a,c,d,m,n,p),x),NonzeroQ(Plus(m,C1))),ZeroQ(Plus(m,Times(n,Plus(p,Negate(C1))),C1))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(d_DEFAULT,ProductLog(Times(a_DEFAULT,Power(x_,n_DEFAULT))))),-1),Power(ProductLog(Times(a_DEFAULT,Power(x_,n_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(a,p),ExpIntegralEi(Times(CN1,p,ProductLog(Times(a,Power(x,n))))),Power(Times(d,n),-1)),And(And(FreeQ(List(a,d,m,n),x),IntegerQ(p)),ZeroQ(Plus(m,Times(n,p),C1))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(d_DEFAULT,ProductLog(Times(a_DEFAULT,Power(x_,n_DEFAULT))))),-1),Power(Times(c_DEFAULT,ProductLog(Times(a_DEFAULT,Power(x_,n_DEFAULT)))),p_)),x_Symbol),
    Condition(Times(Power(a,Plus(p,Negate(C1D2))),Power(c,Plus(p,Negate(C1D2))),Rt(Times(Pi,c,Power(Plus(p,Negate(C1D2)),-1)),C2),Erf(Times(Sqrt(Times(c,ProductLog(Times(a,Power(x,n))))),Power(Rt(Times(c,Power(Plus(p,Negate(C1D2)),-1)),C2),-1))),Power(Times(d,n),-1)),And(And(And(And(FreeQ(List(a,c,d,m,n),x),NonzeroQ(Plus(m,C1))),IntegerQ(Plus(p,Negate(C1D2)))),ZeroQ(Plus(m,Times(n,Plus(p,Negate(C1D2))),C1))),PosQ(Times(c,Power(Plus(p,Negate(C1D2)),-1)))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(d_DEFAULT,ProductLog(Times(a_DEFAULT,Power(x_,n_DEFAULT))))),-1),Power(Times(c_DEFAULT,ProductLog(Times(a_DEFAULT,Power(x_,n_DEFAULT)))),p_)),x_Symbol),
    Condition(Times(Power(a,Plus(p,Negate(C1D2))),Power(c,Plus(p,Negate(C1D2))),Rt(Times(CN1,Pi,c,Power(Plus(p,Negate(C1D2)),-1)),C2),Erfi(Times(Sqrt(Times(c,ProductLog(Times(a,Power(x,n))))),Power(Rt(Times(CN1,c,Power(Plus(p,Negate(C1D2)),-1)),C2),-1))),Power(Times(d,n),-1)),And(And(And(And(FreeQ(List(a,c,d,m,n),x),NonzeroQ(Plus(m,C1))),IntegerQ(Plus(p,Negate(C1D2)))),ZeroQ(Plus(m,Times(n,Plus(p,Negate(C1D2))),C1))),NegQ(Times(c,Power(Plus(p,Negate(C1D2)),-1)))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(d_DEFAULT,ProductLog(Times(a_DEFAULT,Power(x_,n_DEFAULT))))),-1),Power(Times(c_DEFAULT,ProductLog(Times(a_DEFAULT,Power(x_,n_DEFAULT)))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(c,Power(x,Plus(m,C1)),Power(Times(c,ProductLog(Times(a,Power(x,n)))),Plus(p,Negate(C1))),Power(Times(d,Plus(m,C1)),-1)),Times(CN1,c,Plus(m,Times(n,Plus(p,Negate(C1))),C1),Power(Plus(m,C1),-1),Int(Times(Power(x,m),Power(Times(c,ProductLog(Times(a,Power(x,n)))),Plus(p,Negate(C1))),Power(Plus(d,Times(d,ProductLog(Times(a,Power(x,n))))),-1)),x))),And(And(And(FreeQ(List(a,c,d,m,n,p),x),NonzeroQ(Plus(m,C1))),RationalQ(Simplify(Plus(p,Times(Plus(m,C1),Power(n,-1)))))),Greater(Simplify(Plus(p,Times(Plus(m,C1),Power(n,-1)))),C1)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(d_DEFAULT,ProductLog(Times(a_DEFAULT,Power(x_,n_DEFAULT))))),-1),Power(Times(c_DEFAULT,ProductLog(Times(a_DEFAULT,Power(x_,n_DEFAULT)))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Times(c,ProductLog(Times(a,Power(x,n)))),p),Power(Times(d,Plus(m,Times(n,p),C1)),-1)),Times(CN1,Plus(m,C1),Power(Times(c,Plus(m,Times(n,p),C1)),-1),Int(Times(Power(x,m),Power(Times(c,ProductLog(Times(a,Power(x,n)))),Plus(p,C1)),Power(Plus(d,Times(d,ProductLog(Times(a,Power(x,n))))),-1)),x))),And(And(And(FreeQ(List(a,c,d,m,n,p),x),NonzeroQ(Plus(m,C1))),RationalQ(Simplify(Plus(p,Times(Plus(m,C1),Power(n,-1)))))),Less(Simplify(Plus(p,Times(Plus(m,C1),Power(n,-1)))),C0)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(d_DEFAULT,ProductLog(Times(a_DEFAULT,x_)))),-1),Power(Times(c_DEFAULT,ProductLog(Times(a_DEFAULT,x_))),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(x,m),Gamma(Plus(m,p,C1),Times(CN1,Plus(m,C1),ProductLog(Times(a,x)))),Power(Times(c,ProductLog(Times(a,x))),p),Power(Times(a,d,Plus(m,C1),Power(E,Times(m,ProductLog(Times(a,x)))),Power(Times(CN1,Plus(m,C1),ProductLog(Times(a,x))),Plus(m,p))),-1)),And(FreeQ(List(a,c,d,m,p),x),NonzeroQ(Plus(m,C1))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Plus(d_,Times(d_DEFAULT,ProductLog(Times(a_DEFAULT,Power(x_,n_DEFAULT))))),-1),Power(Times(c_DEFAULT,ProductLog(Times(a_DEFAULT,Power(x_,n_DEFAULT)))),p_DEFAULT)),x_Symbol),
    Condition(Negate(Subst(Int(Times(Power(Times(c,ProductLog(Times(a,Power(x,Negate(n))))),p),Power(Times(Power(x,Plus(m,C2)),Plus(d,Times(d,ProductLog(Times(a,Power(x,Negate(n))))))),-1)),x),x,Power(x,-1))),And(And(And(FreeQ(List(a,c,d,p),x),NonzeroQ(Plus(m,C1))),IntegersQ(m,n)),Less(n,C0)))),
ISetDelayed(Int(u_,x_Symbol),
    Condition(Subst(Int(SimplifyIntegrand(Times(Plus(x,C1),Power(E,x),SubstFor(ProductLog(x),u,x)),x),x),x,ProductLog(x)),FunctionOfQ(ProductLog(x),u,x)))
  );
}
