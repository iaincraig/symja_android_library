package org.matheclipse.core.integrate.rubi45;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctions.*;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.ISymbol;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules44 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(pc_DEFAULT,Sqr($($s("§sin"),Plus(c_DEFAULT,Times(x_,pd_DEFAULT))))),Times(pb_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(x_,pd_DEFAULT))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(x_,pd_DEFAULT))))),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(b,CN2),Int(Times(Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),Plus(m,C1)),Simp(Plus(Times(b,pb),Times(CN1,a,pc),Times(b,pc,Sin(Plus(c,Times(pd,x))))),x)),x)),And(FreeQ(List(a,b,c,pd,pa,pb,pc,m),x),ZeroQ(Plus(Times(pa,Sqr(b)),Times(CN1,a,b,pb),Times(Sqr(a),pc)))))),
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(pc_DEFAULT,Sqr($($s("§cos"),Plus(c_DEFAULT,Times(x_,pd_DEFAULT))))),Times(pb_DEFAULT,$($s("§cos"),Plus(c_DEFAULT,Times(x_,pd_DEFAULT))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§cos"),Plus(c_DEFAULT,Times(x_,pd_DEFAULT))))),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(b,CN2),Int(Times(Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),Plus(m,C1)),Simp(Plus(Times(b,pb),Times(CN1,a,pc),Times(b,pc,Cos(Plus(c,Times(pd,x))))),x)),x)),And(FreeQ(List(a,b,c,pd,pa,pb,pc,m),x),ZeroQ(Plus(Times(pa,Sqr(b)),Times(CN1,a,b,pb),Times(Sqr(a),pc)))))),
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(pc_DEFAULT,Sqr($($s("§sin"),Plus(c_DEFAULT,Times(x_,pd_DEFAULT)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(x_,pd_DEFAULT))))),m_DEFAULT)),x_Symbol),
    Condition(Times(pc,Power(b,CN2),Int(Times(Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),Plus(m,C1)),Simp(Plus(Times(CN1,a),Times(b,Sin(Plus(c,Times(pd,x))))),x)),x)),And(FreeQ(List(a,b,c,pd,pa,pc,m),x),ZeroQ(Plus(Times(pa,Sqr(b)),Times(Sqr(a),pc)))))),
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(pc_DEFAULT,Sqr($($s("§cos"),Plus(c_DEFAULT,Times(x_,pd_DEFAULT)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§cos"),Plus(c_DEFAULT,Times(x_,pd_DEFAULT))))),m_DEFAULT)),x_Symbol),
    Condition(Times(pc,Power(b,CN2),Int(Times(Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),Plus(m,C1)),Simp(Plus(Times(CN1,a),Times(b,Cos(Plus(c,Times(pd,x))))),x)),x)),And(FreeQ(List(a,b,c,pd,pa,pc,m),x),ZeroQ(Plus(Times(pa,Sqr(b)),Times(Sqr(a),pc)))))),
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(pc_DEFAULT,Sqr($($s("§sin"),Plus(c_DEFAULT,Times(x_,pd_DEFAULT))))),Times(pb_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(x_,pd_DEFAULT))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(x_,pd_DEFAULT))))),m_)),x_Symbol),
    Condition(Plus(Times(Plus(Times(pa,b),Times(CN1,a,pb),Times(b,pc)),Cos(Plus(c,Times(pd,x))),Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),m),Power(Times(a,pd,Plus(Times(C2,m),C1)),CN1)),Times(Power(Times(Sqr(a),Plus(Times(C2,m),C1)),CN1),Int(Times(Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),Plus(m,C1)),Simp(Plus(Times(a,pa,Plus(m,C1)),Times(m,Plus(Times(b,pb),Times(CN1,a,pc))),Times(b,pc,Plus(Times(C2,m),C1),Sin(Plus(c,Times(pd,x))))),x)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pa,pb,pc),x),NonzeroQ(Plus(Times(pa,Sqr(b)),Times(CN1,a,b,pb),Times(Sqr(a),pc)))),RationalQ(m)),Less(m,CN1)),ZeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))))),
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(pc_DEFAULT,Sqr($($s("§cos"),Plus(c_DEFAULT,Times(x_,pd_DEFAULT))))),Times(pb_DEFAULT,$($s("§cos"),Plus(c_DEFAULT,Times(x_,pd_DEFAULT))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§cos"),Plus(c_DEFAULT,Times(x_,pd_DEFAULT))))),m_)),x_Symbol),
    Condition(Plus(Times(CN1,Plus(Times(pa,b),Times(CN1,a,pb),Times(b,pc)),Sin(Plus(c,Times(pd,x))),Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),m),Power(Times(a,pd,Plus(Times(C2,m),C1)),CN1)),Times(Power(Times(Sqr(a),Plus(Times(C2,m),C1)),CN1),Int(Times(Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),Plus(m,C1)),Simp(Plus(Times(a,pa,Plus(m,C1)),Times(m,Plus(Times(b,pb),Times(CN1,a,pc))),Times(b,pc,Plus(Times(C2,m),C1),Cos(Plus(c,Times(pd,x))))),x)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pa,pb,pc),x),NonzeroQ(Plus(Times(pa,Sqr(b)),Times(CN1,a,b,pb),Times(Sqr(a),pc)))),RationalQ(m)),Less(m,CN1)),ZeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))))),
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(pc_DEFAULT,Sqr($($s("§sin"),Plus(c_DEFAULT,Times(x_,pd_DEFAULT)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(x_,pd_DEFAULT))))),m_)),x_Symbol),
    Condition(Plus(Times(b,Plus(pa,pc),Cos(Plus(c,Times(pd,x))),Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),m),Power(Times(a,pd,Plus(Times(C2,m),C1)),CN1)),Times(Power(Times(Sqr(a),Plus(Times(C2,m),C1)),CN1),Int(Times(Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),Plus(m,C1)),Simp(Plus(Times(a,pa,Plus(m,C1)),Times(CN1,a,pc,m),Times(b,pc,Plus(Times(C2,m),C1),Sin(Plus(c,Times(pd,x))))),x)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pa,pc),x),NonzeroQ(Plus(Times(pa,Sqr(b)),Times(Sqr(a),pc)))),RationalQ(m)),Less(m,CN1)),ZeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))))),
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(pc_DEFAULT,Sqr($($s("§cos"),Plus(c_DEFAULT,Times(x_,pd_DEFAULT)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§cos"),Plus(c_DEFAULT,Times(x_,pd_DEFAULT))))),m_)),x_Symbol),
    Condition(Plus(Times(CN1,b,Plus(pa,pc),Sin(Plus(c,Times(pd,x))),Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),m),Power(Times(a,pd,Plus(Times(C2,m),C1)),CN1)),Times(Power(Times(Sqr(a),Plus(Times(C2,m),C1)),CN1),Int(Times(Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),Plus(m,C1)),Simp(Plus(Times(a,pa,Plus(m,C1)),Times(CN1,a,pc,m),Times(b,pc,Plus(Times(C2,m),C1),Cos(Plus(c,Times(pd,x))))),x)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pa,pc),x),NonzeroQ(Plus(Times(pa,Sqr(b)),Times(Sqr(a),pc)))),RationalQ(m)),Less(m,CN1)),ZeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))))),
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(pc_DEFAULT,Sqr($($s("§sin"),Plus(c_DEFAULT,Times(x_,pd_DEFAULT))))),Times(pb_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(x_,pd_DEFAULT))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(x_,pd_DEFAULT))))),m_)),x_Symbol),
    Condition(Plus(Times(CN1,Plus(Times(pa,Sqr(b)),Times(CN1,a,b,pb),Times(Sqr(a),pc)),Cos(Plus(c,Times(pd,x))),Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),Plus(m,C1)),Power(Times(b,pd,Plus(m,C1),Plus(Sqr(a),Times(CN1,Sqr(b)))),CN1)),Times(Power(Times(b,Plus(m,C1),Plus(Sqr(a),Times(CN1,Sqr(b)))),CN1),Int(Times(Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),Plus(m,C1)),Simp(Plus(Times(b,Plus(Times(a,pa),Times(CN1,b,pb),Times(a,pc)),Plus(m,C1)),Times(CN1,Plus(Times(pa,Sqr(b)),Times(CN1,a,b,pb),Times(Sqr(a),pc),Times(b,Plus(Times(pa,b),Times(CN1,a,pb),Times(b,pc)),Plus(m,C1))),Sin(Plus(c,Times(pd,x))))),x)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pa,pb,pc),x),NonzeroQ(Plus(Times(pa,Sqr(b)),Times(CN1,a,b,pb),Times(Sqr(a),pc)))),RationalQ(m)),Less(m,CN1)),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))))),
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(pc_DEFAULT,Sqr($($s("§cos"),Plus(c_DEFAULT,Times(x_,pd_DEFAULT))))),Times(pb_DEFAULT,$($s("§cos"),Plus(c_DEFAULT,Times(x_,pd_DEFAULT))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cos"),Plus(c_DEFAULT,Times(x_,pd_DEFAULT))))),m_)),x_Symbol),
    Condition(Plus(Times(Plus(Times(pa,Sqr(b)),Times(CN1,a,b,pb),Times(Sqr(a),pc)),Sin(Plus(c,Times(pd,x))),Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),Plus(m,C1)),Power(Times(b,pd,Plus(m,C1),Plus(Sqr(a),Times(CN1,Sqr(b)))),CN1)),Times(Power(Times(b,Plus(m,C1),Plus(Sqr(a),Times(CN1,Sqr(b)))),CN1),Int(Times(Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),Plus(m,C1)),Simp(Plus(Times(b,Plus(Times(a,pa),Times(CN1,b,pb),Times(a,pc)),Plus(m,C1)),Times(CN1,Plus(Times(pa,Sqr(b)),Times(CN1,a,b,pb),Times(Sqr(a),pc),Times(b,Plus(Times(pa,b),Times(CN1,a,pb),Times(b,pc)),Plus(m,C1))),Cos(Plus(c,Times(pd,x))))),x)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pa,pb,pc),x),NonzeroQ(Plus(Times(pa,Sqr(b)),Times(CN1,a,b,pb),Times(Sqr(a),pc)))),RationalQ(m)),Less(m,CN1)),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))))),
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(pc_DEFAULT,Sqr($($s("§sin"),Plus(c_DEFAULT,Times(x_,pd_DEFAULT)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(x_,pd_DEFAULT))))),m_)),x_Symbol),
    Condition(Plus(Times(CN1,Plus(Times(pa,Sqr(b)),Times(Sqr(a),pc)),Cos(Plus(c,Times(pd,x))),Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),Plus(m,C1)),Power(Times(b,pd,Plus(m,C1),Plus(Sqr(a),Times(CN1,Sqr(b)))),CN1)),Times(Power(Times(b,Plus(m,C1),Plus(Sqr(a),Times(CN1,Sqr(b)))),CN1),Int(Times(Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),Plus(m,C1)),Simp(Plus(Times(a,b,Plus(pa,pc),Plus(m,C1)),Times(CN1,Plus(Times(pa,Sqr(b)),Times(Sqr(a),pc),Times(Sqr(b),Plus(pa,pc),Plus(m,C1))),Sin(Plus(c,Times(pd,x))))),x)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pa,pc),x),NonzeroQ(Plus(Times(pa,Sqr(b)),Times(Sqr(a),pc)))),RationalQ(m)),Less(m,CN1)),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))))),
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(pc_DEFAULT,Sqr($($s("§cos"),Plus(c_DEFAULT,Times(x_,pd_DEFAULT)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cos"),Plus(c_DEFAULT,Times(x_,pd_DEFAULT))))),m_)),x_Symbol),
    Condition(Plus(Times(Plus(Times(pa,Sqr(b)),Times(Sqr(a),pc)),Sin(Plus(c,Times(pd,x))),Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),Plus(m,C1)),Power(Times(b,pd,Plus(m,C1),Plus(Sqr(a),Times(CN1,Sqr(b)))),CN1)),Times(Power(Times(b,Plus(m,C1),Plus(Sqr(a),Times(CN1,Sqr(b)))),CN1),Int(Times(Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),Plus(m,C1)),Simp(Plus(Times(a,b,Plus(pa,pc),Plus(m,C1)),Times(CN1,Plus(Times(pa,Sqr(b)),Times(Sqr(a),pc),Times(Sqr(b),Plus(pa,pc),Plus(m,C1))),Cos(Plus(c,Times(pd,x))))),x)),x))),And(And(And(And(FreeQ(List(a,b,c,pd,pa,pc),x),NonzeroQ(Plus(Times(pa,Sqr(b)),Times(Sqr(a),pc)))),RationalQ(m)),Less(m,CN1)),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))))),
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(pc_DEFAULT,Sqr($($s("§sin"),Plus(c_DEFAULT,Times(x_,pd_DEFAULT))))),Times(pb_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(x_,pd_DEFAULT))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(x_,pd_DEFAULT))))),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,pc,Cos(Plus(c,Times(pd,x))),Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),Plus(m,C1)),Power(Times(b,pd,Plus(m,C2)),CN1)),Times(Power(Times(b,Plus(m,C2)),CN1),Int(Times(Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),m),Simp(Plus(Times(pa,b,Plus(m,C2)),Times(b,pc,Plus(m,C1)),Times(Plus(Times(b,pb,Plus(m,C2)),Times(CN1,a,pc)),Sin(Plus(c,Times(pd,x))))),x)),x))),And(And(FreeQ(List(a,b,c,pd,pa,pb,pc,m),x),NonzeroQ(Plus(Times(pa,Sqr(b)),Times(CN1,a,b,pb),Times(Sqr(a),pc)))),Not(And(RationalQ(m),Less(m,CN1)))))),
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(pc_DEFAULT,Sqr($($s("§cos"),Plus(c_DEFAULT,Times(x_,pd_DEFAULT))))),Times(pb_DEFAULT,$($s("§cos"),Plus(c_DEFAULT,Times(x_,pd_DEFAULT))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cos"),Plus(c_DEFAULT,Times(x_,pd_DEFAULT))))),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(pc,Sin(Plus(c,Times(pd,x))),Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),Plus(m,C1)),Power(Times(b,pd,Plus(m,C2)),CN1)),Times(Power(Times(b,Plus(m,C2)),CN1),Int(Times(Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),m),Simp(Plus(Times(pa,b,Plus(m,C2)),Times(b,pc,Plus(m,C1)),Times(Plus(Times(b,pb,Plus(m,C2)),Times(CN1,a,pc)),Cos(Plus(c,Times(pd,x))))),x)),x))),And(And(FreeQ(List(a,b,c,pd,pa,pb,pc,m),x),NonzeroQ(Plus(Times(pa,Sqr(b)),Times(CN1,a,b,pb),Times(Sqr(a),pc)))),Not(And(RationalQ(m),Less(m,CN1)))))),
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(pc_DEFAULT,Sqr($($s("§sin"),Plus(c_DEFAULT,Times(x_,pd_DEFAULT)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§sin"),Plus(c_DEFAULT,Times(x_,pd_DEFAULT))))),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,pc,Cos(Plus(c,Times(pd,x))),Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),Plus(m,C1)),Power(Times(b,pd,Plus(m,C2)),CN1)),Times(Power(Times(b,Plus(m,C2)),CN1),Int(Times(Power(Plus(a,Times(b,Sin(Plus(c,Times(pd,x))))),m),Simp(Plus(Times(pa,b,Plus(m,C2)),Times(b,pc,Plus(m,C1)),Times(CN1,a,pc,Sin(Plus(c,Times(pd,x))))),x)),x))),And(And(FreeQ(List(a,b,c,pd,pa,pc,m),x),NonzeroQ(Plus(Times(pa,Sqr(b)),Times(Sqr(a),pc)))),Not(And(RationalQ(m),Less(m,CN1)))))),
ISetDelayed(Int(Times(Plus(pa_DEFAULT,Times(pc_DEFAULT,Sqr($($s("§cos"),Plus(c_DEFAULT,Times(x_,pd_DEFAULT)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cos"),Plus(c_DEFAULT,Times(x_,pd_DEFAULT))))),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(pc,Sin(Plus(c,Times(pd,x))),Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),Plus(m,C1)),Power(Times(b,pd,Plus(m,C2)),CN1)),Times(Power(Times(b,Plus(m,C2)),CN1),Int(Times(Power(Plus(a,Times(b,Cos(Plus(c,Times(pd,x))))),m),Simp(Plus(Times(pa,b,Plus(m,C2)),Times(b,pc,Plus(m,C1)),Times(CN1,a,pc,Cos(Plus(c,Times(pd,x))))),x)),x))),And(And(FreeQ(List(a,b,c,pd,pa,pc,m),x),NonzeroQ(Plus(Times(pa,Sqr(b)),Times(Sqr(a),pc)))),Not(And(RationalQ(m),Less(m,CN1))))))
  );
}