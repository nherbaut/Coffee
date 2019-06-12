
	
function Model(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/Model"+(pId ? "/"+pId : "");
	this.id = pId;
 	this.elements = function(aId){
    	return new ElmDeclaration(this.url+"/elements",aId);
 	};
 	this.relations = function(aId){
    	return new RelDeclaration(this.url+"/relations",aId);
 	};
 	this.operations = function(aId){
    	return new Operations(this.url+"/operations",aId);
 	};
}

	
function ElmDeclaration(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+""+(pId ? "/"+pId : "");
	this.id = pId;
 	this.declaration = function(aId){
    	return new Declaration(this.url+"/declaration",aId);
 	};
}

	
function Declaration(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+""+(pId ? "/"+pId : "");
	this.id = pId;
}

	
function ConstantDecl(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/ConstantDecl"+(pId ? "/"+pId : "");
	this.id = pId;
 	this.value = function(aId){
    	return new Value(this.url+"/value",aId);
 	};
}

	
function VariableDecl(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/VariableDecl"+(pId ? "/"+pId : "");
	this.id = pId;
 	this.variants = function(aId){
    	return new OptionsDeclaration(this.url+"/variants",aId);
 	};
}

	
function OptionsDeclaration(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+""+(pId ? "/"+pId : "");
	this.id = pId;
}

	
function Interval(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/Interval"+(pId ? "/"+pId : "");
	this.id = pId;
}

	
function Enumeration(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/Enumeration"+(pId ? "/"+pId : "");
	this.id = pId;
 	this.list = function(aId){
    	return new ListOfValues(this.url+"/list",aId);
 	};
}

	
function RelDeclaration(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+""+(pId ? "/"+pId : "");
	this.id = pId;
 	this.exp = function(aId){
    	return new Relation(this.url+"/exp",aId);
 	};
}

	
function Relation(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+""+(pId ? "/"+pId : "");
	this.id = pId;
}

	
function Core(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/Core"+(pId ? "/"+pId : "");
	this.id = pId;
 	this.elements = function(aId){
    	return new ListOfIDs(this.url+"/elements",aId);
 	};
}

	
function MultInstantiation(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/MultInstantiation"+(pId ? "/"+pId : "");
	this.id = pId;
 	this.name = function(aId){
    	return new ElmDeclaration(this.url+"/name",aId);
 	};
 	this.min = function(aId){
    	return new Number(this.url+"/min",aId);
 	};
 	this.max = function(aId){
    	return new Number(this.url+"/max",aId);
 	};
}

	
function Pair(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/Pair"+(pId ? "/"+pId : "");
	this.id = pId;
 	this.var1 = function(aId){
    	return new ElmDeclaration(this.url+"/var1",aId);
 	};
 	this.var2 = function(aId){
    	return new ElmDeclaration(this.url+"/var2",aId);
 	};
}

	
function ComplexImplies(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/ComplexImplies"+(pId ? "/"+pId : "");
	this.id = pId;
 	this.exp = function(aId){
    	return new Expression(this.url+"/exp",aId);
 	};
 	this.elements = function(aId){
    	return new ListOfIDs(this.url+"/elements",aId);
 	};
}

	
function QImplies(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/QImplies"+(pId ? "/"+pId : "");
	this.id = pId;
 	this.var1 = function(aId){
    	return new ElmDeclaration(this.url+"/var1",aId);
 	};
 	this.var2 = function(aId){
    	return new ElmDeclaration(this.url+"/var2",aId);
 	};
}

	
function VarList(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/VarList"+(pId ? "/"+pId : "");
	this.id = pId;
 	this.var1 = function(aId){
    	return new ElmDeclaration(this.url+"/var1",aId);
 	};
 	this.list = function(aId){
    	return new ListOfIDs(this.url+"/list",aId);
 	};
}

	
function Hierarchy(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/Hierarchy"+(pId ? "/"+pId : "");
	this.id = pId;
 	this.parent = function(aId){
    	return new ElmDeclaration(this.url+"/parent",aId);
 	};
 	this.children = function(aId){
    	return new ListOfIDs(this.url+"/children",aId);
 	};
}

	
function Decomposition(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/Decomposition"+(pId ? "/"+pId : "");
	this.id = pId;
 	this.parent = function(aId){
    	return new ElmDeclaration(this.url+"/parent",aId);
 	};
 	this.children = function(aId){
    	return new ListOfIDs(this.url+"/children",aId);
 	};
}

	
function Group(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/Group"+(pId ? "/"+pId : "");
	this.id = pId;
 	this.parent = function(aId){
    	return new ElmDeclaration(this.url+"/parent",aId);
 	};
 	this.children = function(aId){
    	return new ListOfIDs(this.url+"/children",aId);
 	};
 	this.max = function(aId){
    	return new Range(this.url+"/max",aId);
 	};
}

	
function Range(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+""+(pId ? "/"+pId : "");
	this.id = pId;
}

	
function Visibility(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/Visibility"+(pId ? "/"+pId : "");
	this.id = pId;
 	this.condition = function(aId){
    	return new Relational(this.url+"/condition",aId);
 	};
 	this.children = function(aId){
    	return new ListOfRelRefs(this.url+"/children",aId);
 	};
}

	
function Order(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/Order"+(pId ? "/"+pId : "");
	this.id = pId;
 	this.left = function(aId){
    	return new ElmDeclaration(this.url+"/left",aId);
 	};
 	this.right = function(aId){
    	return new ListOfIDs(this.url+"/right",aId);
 	};
}

	
function Expression(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+""+(pId ? "/"+pId : "");
	this.id = pId;
 	this.exp = function(aId){
    	return new Relational(this.url+"/exp",aId);
 	};
}

	
function Relational(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+""+(pId ? "/"+pId : "");
	this.id = pId;
}

	
function Operations(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+""+(pId ? "/"+pId : "");
	this.id = pId;
 	this.op = function(aId){
    	return new Operation(this.url+"/op",aId);
 	};
}

	
function Operation(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+""+(pId ? "/"+pId : "");
	this.id = pId;
}

	
function BoolVal(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/BoolVal"+(pId ? "/"+pId : "");
	this.id = pId;
}

	
function Number(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+""+(pId ? "/"+pId : "");
	this.id = pId;
}

	
function Symbol(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/Symbol"+(pId ? "/"+pId : "");
	this.id = pId;
}

	
function Value(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+""+(pId ? "/"+pId : "");
	this.id = pId;
}

	
function ListOfValues(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+""+(pId ? "/"+pId : "");
	this.id = pId;
 	this.values = function(aId){
    	return new Value(this.url+"/values",aId);
 	};
}

	
function ListOfIDs(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+""+(pId ? "/"+pId : "");
	this.id = pId;
 	this.values = function(aId){
    	return new ElmDeclaration(this.url+"/values",aId);
 	};
}

	
function ListOfRelRefs(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+""+(pId ? "/"+pId : "");
	this.id = pId;
 	this.ids = function(aId){
    	return new RelDeclaration(this.url+"/ids",aId);
 	};
}

	
function Names(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/Names"+(pId ? "/"+pId : "");
	this.id = pId;
}

	
function Valuation(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+""+(pId ? "/"+pId : "");
	this.id = pId;
 	this.element = function(aId){
    	return new ElmDeclaration(this.url+"/element",aId);
 	};
 	this.value = function(aId){
    	return new Value(this.url+"/value",aId);
 	};
}

	
function ListOfValuation(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+""+(pId ? "/"+pId : "");
	this.id = pId;
 	this.pairs = function(aId){
    	return new Valuation(this.url+"/pairs",aId);
 	};
}

	
function ListOfListValues(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/ListOfListValues"+(pId ? "/"+pId : "");
	this.id = pId;
 	this.list = function(aId){
    	return new ListOfValues(this.url+"/list",aId);
 	};
}

	
function Iff(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/Iff"+(pId ? "/"+pId : "");
	this.id = pId;
 	this.left = function(aId){
    	return new Relational(this.url+"/left",aId);
 	};
 	this.right = function(aId){
    	return new Relational(this.url+"/right",aId);
 	};
}

	
function Implies(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/Implies"+(pId ? "/"+pId : "");
	this.id = pId;
 	this.left = function(aId){
    	return new Relational(this.url+"/left",aId);
 	};
 	this.right = function(aId){
    	return new Relational(this.url+"/right",aId);
 	};
}

	
function Or(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/Or"+(pId ? "/"+pId : "");
	this.id = pId;
 	this.left = function(aId){
    	return new Relational(this.url+"/left",aId);
 	};
 	this.right = function(aId){
    	return new Relational(this.url+"/right",aId);
 	};
}

	
function And(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/And"+(pId ? "/"+pId : "");
	this.id = pId;
 	this.left = function(aId){
    	return new Relational(this.url+"/left",aId);
 	};
 	this.right = function(aId){
    	return new Relational(this.url+"/right",aId);
 	};
}

	
function Equality(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/Equality"+(pId ? "/"+pId : "");
	this.id = pId;
 	this.left = function(aId){
    	return new Relational(this.url+"/left",aId);
 	};
 	this.right = function(aId){
    	return new Relational(this.url+"/right",aId);
 	};
}

	
function Comparison(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/Comparison"+(pId ? "/"+pId : "");
	this.id = pId;
 	this.left = function(aId){
    	return new Relational(this.url+"/left",aId);
 	};
 	this.right = function(aId){
    	return new Relational(this.url+"/right",aId);
 	};
}

	
function Plus(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/Plus"+(pId ? "/"+pId : "");
	this.id = pId;
 	this.left = function(aId){
    	return new Relational(this.url+"/left",aId);
 	};
 	this.right = function(aId){
    	return new Relational(this.url+"/right",aId);
 	};
}

	
function Minus(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/Minus"+(pId ? "/"+pId : "");
	this.id = pId;
 	this.left = function(aId){
    	return new Relational(this.url+"/left",aId);
 	};
 	this.right = function(aId){
    	return new Relational(this.url+"/right",aId);
 	};
}

	
function MulOrDiv(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/MulOrDiv"+(pId ? "/"+pId : "");
	this.id = pId;
 	this.left = function(aId){
    	return new Relational(this.url+"/left",aId);
 	};
 	this.right = function(aId){
    	return new Relational(this.url+"/right",aId);
 	};
}

	
function Negation(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/Negation"+(pId ? "/"+pId : "");
	this.id = pId;
 	this.expression = function(aId){
    	return new Relational(this.url+"/expression",aId);
 	};
}

	
function Unary(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/Unary"+(pId ? "/"+pId : "");
	this.id = pId;
 	this.expression = function(aId){
    	return new Relational(this.url+"/expression",aId);
 	};
}

	
function Function(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/Function"+(pId ? "/"+pId : "");
	this.id = pId;
 	this.left = function(aId){
    	return new Relational(this.url+"/left",aId);
 	};
 	this.right = function(aId){
    	return new Relational(this.url+"/right",aId);
 	};
}

	
function BoolConstant(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/BoolConstant"+(pId ? "/"+pId : "");
	this.id = pId;
}

	
function VariableRef(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/VariableRef"+(pId ? "/"+pId : "");
	this.id = pId;
 	this.variable = function(aId){
    	return new ElmDeclaration(this.url+"/variable",aId);
 	};
}

	
function AttributeRef(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/AttributeRef"+(pId ? "/"+pId : "");
	this.id = pId;
}

	
function StringConstant(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/StringConstant"+(pId ? "/"+pId : "");
	this.id = pId;
}

	
function IntConstant(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/IntConstant"+(pId ? "/"+pId : "");
	this.id = pId;
}

	
function SingleInstruction(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/SingleInstruction"+(pId ? "/"+pId : "");
	this.id = pId;
}

	
function ValidConf(baseUrl,pId){
    this.url = stipTrailingSlash(baseUrl)+"/ValidConf"+(pId ? "/"+pId : "");
	this.id = pId;
 	this.valuations = function(aId){
    	return new ListOfValuation(this.url+"/valuations",aId);
 	};
}


function stipTrailingSlash(str){
   if(str.charAt(str.length-1) == "/"){ str = str.substr(0, str.length - 1);}
   return str;
}

function restApi() {
	this.callGet = function(url, doneCallBack, depth, failCallBack) {
	  callAjax("GET", url, {depth : (depth ? depth : 0 )}, doneCallBack, failCallBack);
	};

	this.callPut = function(url, data,  doneCallBack, depth, failCallBack) {
	  callAjax("GET", url, {depth : (depth ? depth : 0 )}, doneCallBack, failCallBack);
	};

	this.callPost = function(url, data, doneCallBack, depth, failCallBack) {
	  callAjax("GET", url, {depth : (depth ? depth : 0 )}, doneCallBack, failCallBack);
	};

	this.callDelete = function(url, doneCallBack, depth, failCallBack) {
	  callAjax("GET", url, {depth : (depth ? depth : 0 )}, doneCallBack, failCallBack);
	};
	
	function callAjax(method, url, params, doneCallBack, errorCallBack){
	$.ajax({
		type: method,
		data: params,
		url : url,
		beforeSend : function(xhr) {
			xhr.overrideMimeType("application/json; charset=x-user-defined");
		} 
	}).done(function(data) {
		   doneCallBack(data);
	}).fail(function(){
	
	});	
}

}

var RestApi = new restApi();