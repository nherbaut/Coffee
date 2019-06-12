package webmapi.rest;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ejb.Stateless;
import javax.inject.Inject;



import webmapi.util.ResourceSaver;

import hlvl.*;
import hlvl.service.*;

@Path("")
public class WebApiService{

  	@Inject
	private ResourceSaver resourceSaver;


   @Path("Model/{id}")
   public ModelResource handleModel(@PathParam("id") String id)
   {
     return new ModelResource((Model)resourceSaver.get("hlvl.Model",id),id,resourceSaver);
   }

  
 
   @Path("ConstantDecl/{id}")
   public ConstantDeclResource handleConstantDecl(@PathParam("id") String id)
   {
     return new ConstantDeclResource((ConstantDecl)resourceSaver.get("hlvl.ConstantDecl",id),id,resourceSaver);
   }

  
 
   @Path("VariableDecl/{id}")
   public VariableDeclResource handleVariableDecl(@PathParam("id") String id)
   {
     return new VariableDeclResource((VariableDecl)resourceSaver.get("hlvl.VariableDecl",id),id,resourceSaver);
   }

  
 
   @Path("Interval/{id}")
   public IntervalResource handleInterval(@PathParam("id") String id)
   {
     return new IntervalResource((Interval)resourceSaver.get("hlvl.Interval",id),id,resourceSaver);
   }

  
 
   @Path("Enumeration/{id}")
   public EnumerationResource handleEnumeration(@PathParam("id") String id)
   {
     return new EnumerationResource((Enumeration)resourceSaver.get("hlvl.Enumeration",id),id,resourceSaver);
   }

  
 
   @Path("Core/{id}")
   public CoreResource handleCore(@PathParam("id") String id)
   {
     return new CoreResource((Core)resourceSaver.get("hlvl.Core",id),id,resourceSaver);
   }

  
 
   @Path("MultInstantiation/{id}")
   public MultInstantiationResource handleMultInstantiation(@PathParam("id") String id)
   {
     return new MultInstantiationResource((MultInstantiation)resourceSaver.get("hlvl.MultInstantiation",id),id,resourceSaver);
   }

  
 
   @Path("Pair/{id}")
   public PairResource handlePair(@PathParam("id") String id)
   {
     return new PairResource((Pair)resourceSaver.get("hlvl.Pair",id),id,resourceSaver);
   }

  
 
   @Path("ComplexImplies/{id}")
   public ComplexImpliesResource handleComplexImplies(@PathParam("id") String id)
   {
     return new ComplexImpliesResource((ComplexImplies)resourceSaver.get("hlvl.ComplexImplies",id),id,resourceSaver);
   }

  
 
   @Path("QImplies/{id}")
   public QImpliesResource handleQImplies(@PathParam("id") String id)
   {
     return new QImpliesResource((QImplies)resourceSaver.get("hlvl.QImplies",id),id,resourceSaver);
   }

  
 
   @Path("VarList/{id}")
   public VarListResource handleVarList(@PathParam("id") String id)
   {
     return new VarListResource((VarList)resourceSaver.get("hlvl.VarList",id),id,resourceSaver);
   }

  
 
   @Path("Hierarchy/{id}")
   public HierarchyResource handleHierarchy(@PathParam("id") String id)
   {
     return new HierarchyResource((Hierarchy)resourceSaver.get("hlvl.Hierarchy",id),id,resourceSaver);
   }

  
 
   @Path("Decomposition/{id}")
   public DecompositionResource handleDecomposition(@PathParam("id") String id)
   {
     return new DecompositionResource((Decomposition)resourceSaver.get("hlvl.Decomposition",id),id,resourceSaver);
   }

  
 
   @Path("Group/{id}")
   public GroupResource handleGroup(@PathParam("id") String id)
   {
     return new GroupResource((Group)resourceSaver.get("hlvl.Group",id),id,resourceSaver);
   }

  
 
   @Path("Visibility/{id}")
   public VisibilityResource handleVisibility(@PathParam("id") String id)
   {
     return new VisibilityResource((Visibility)resourceSaver.get("hlvl.Visibility",id),id,resourceSaver);
   }

  
 
   @Path("Order/{id}")
   public OrderResource handleOrder(@PathParam("id") String id)
   {
     return new OrderResource((Order)resourceSaver.get("hlvl.Order",id),id,resourceSaver);
   }

  
 
   @Path("BoolVal/{id}")
   public BoolValResource handleBoolVal(@PathParam("id") String id)
   {
     return new BoolValResource((BoolVal)resourceSaver.get("hlvl.BoolVal",id),id,resourceSaver);
   }

  
 
   @Path("Symbol/{id}")
   public SymbolResource handleSymbol(@PathParam("id") String id)
   {
     return new SymbolResource((Symbol)resourceSaver.get("hlvl.Symbol",id),id,resourceSaver);
   }

  
 
   @Path("Names/{id}")
   public NamesResource handleNames(@PathParam("id") String id)
   {
     return new NamesResource((Names)resourceSaver.get("hlvl.Names",id),id,resourceSaver);
   }

  
 
   @Path("ListOfListValues/{id}")
   public ListOfListValuesResource handleListOfListValues(@PathParam("id") String id)
   {
     return new ListOfListValuesResource((ListOfListValues)resourceSaver.get("hlvl.ListOfListValues",id),id,resourceSaver);
   }

  
 
   @Path("Iff/{id}")
   public IffResource handleIff(@PathParam("id") String id)
   {
     return new IffResource((Iff)resourceSaver.get("hlvl.Iff",id),id,resourceSaver);
   }

  
 
   @Path("Implies/{id}")
   public ImpliesResource handleImplies(@PathParam("id") String id)
   {
     return new ImpliesResource((Implies)resourceSaver.get("hlvl.Implies",id),id,resourceSaver);
   }

  
 
   @Path("Or/{id}")
   public OrResource handleOr(@PathParam("id") String id)
   {
     return new OrResource((Or)resourceSaver.get("hlvl.Or",id),id,resourceSaver);
   }

  
 
   @Path("And/{id}")
   public AndResource handleAnd(@PathParam("id") String id)
   {
     return new AndResource((And)resourceSaver.get("hlvl.And",id),id,resourceSaver);
   }

  
 
   @Path("Equality/{id}")
   public EqualityResource handleEquality(@PathParam("id") String id)
   {
     return new EqualityResource((Equality)resourceSaver.get("hlvl.Equality",id),id,resourceSaver);
   }

  
 
   @Path("Comparison/{id}")
   public ComparisonResource handleComparison(@PathParam("id") String id)
   {
     return new ComparisonResource((Comparison)resourceSaver.get("hlvl.Comparison",id),id,resourceSaver);
   }

  
 
   @Path("Plus/{id}")
   public PlusResource handlePlus(@PathParam("id") String id)
   {
     return new PlusResource((Plus)resourceSaver.get("hlvl.Plus",id),id,resourceSaver);
   }

  
 
   @Path("Minus/{id}")
   public MinusResource handleMinus(@PathParam("id") String id)
   {
     return new MinusResource((Minus)resourceSaver.get("hlvl.Minus",id),id,resourceSaver);
   }

  
 
   @Path("MulOrDiv/{id}")
   public MulOrDivResource handleMulOrDiv(@PathParam("id") String id)
   {
     return new MulOrDivResource((MulOrDiv)resourceSaver.get("hlvl.MulOrDiv",id),id,resourceSaver);
   }

  
 
   @Path("Negation/{id}")
   public NegationResource handleNegation(@PathParam("id") String id)
   {
     return new NegationResource((Negation)resourceSaver.get("hlvl.Negation",id),id,resourceSaver);
   }

  
 
   @Path("Unary/{id}")
   public UnaryResource handleUnary(@PathParam("id") String id)
   {
     return new UnaryResource((Unary)resourceSaver.get("hlvl.Unary",id),id,resourceSaver);
   }

  
 
   @Path("Function/{id}")
   public FunctionResource handleFunction(@PathParam("id") String id)
   {
     return new FunctionResource((Function)resourceSaver.get("hlvl.Function",id),id,resourceSaver);
   }

  
 
   @Path("BoolConstant/{id}")
   public BoolConstantResource handleBoolConstant(@PathParam("id") String id)
   {
     return new BoolConstantResource((BoolConstant)resourceSaver.get("hlvl.BoolConstant",id),id,resourceSaver);
   }

  
 
   @Path("VariableRef/{id}")
   public VariableRefResource handleVariableRef(@PathParam("id") String id)
   {
     return new VariableRefResource((VariableRef)resourceSaver.get("hlvl.VariableRef",id),id,resourceSaver);
   }

  
 
   @Path("AttributeRef/{id}")
   public AttributeRefResource handleAttributeRef(@PathParam("id") String id)
   {
     return new AttributeRefResource((AttributeRef)resourceSaver.get("hlvl.AttributeRef",id),id,resourceSaver);
   }

  
 
   @Path("StringConstant/{id}")
   public StringConstantResource handleStringConstant(@PathParam("id") String id)
   {
     return new StringConstantResource((StringConstant)resourceSaver.get("hlvl.StringConstant",id),id,resourceSaver);
   }

  
 
   @Path("IntConstant/{id}")
   public IntConstantResource handleIntConstant(@PathParam("id") String id)
   {
     return new IntConstantResource((IntConstant)resourceSaver.get("hlvl.IntConstant",id),id,resourceSaver);
   }

  
 
   @Path("SingleInstruction/{id}")
   public SingleInstructionResource handleSingleInstruction(@PathParam("id") String id)
   {
     return new SingleInstructionResource((SingleInstruction)resourceSaver.get("hlvl.SingleInstruction",id),id,resourceSaver);
   }

  
 
   @Path("ValidConf/{id}")
   public ValidConfResource handleValidConf(@PathParam("id") String id)
   {
     return new ValidConfResource((ValidConf)resourceSaver.get("hlvl.ValidConf",id),id,resourceSaver);
   }

  
 
}

