//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package mondrian.resource;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;
import mondrian.olap.InvalidHierarchyException;
import mondrian.olap.MondrianException;
import mondrian.olap.NativeEvaluationUnsupportedException;
import mondrian.olap.QueryCanceledException;
import mondrian.olap.QueryTimeoutException;
import mondrian.olap.ResourceLimitExceededException;
import org.eigenbase.resgen.ResourceDefinition;
import org.eigenbase.resgen.ShadowResourceBundle;

public class MondrianResource extends ShadowResourceBundle {
    private static final String baseName = "mondrian.resource.MondrianResource";
    public final MondrianResource._Def0 Internal = new MondrianResource._Def0("Internal", "Internal error: {0}", (String[])null);
    public final MondrianResource._Def0 MdxCubeNotFound = new MondrianResource._Def0("MdxCubeNotFound", "MDX cube ''{0}'' not found", (String[])null);
    public final MondrianResource._Def1 MdxChildObjectNotFound = new MondrianResource._Def1("MdxChildObjectNotFound", "MDX object ''{0}'' not found in {1}", (String[])null);
    public final MondrianResource._Def0 MemberNotFound = new MondrianResource._Def0("MemberNotFound", "Member ''{0}'' not found", (String[])null);
    public final MondrianResource._Def2 MdxCubeName = new MondrianResource._Def2("MdxCubeName", "cube ''{0}''", (String[])null);
    public final MondrianResource._Def2 MdxHierarchyName = new MondrianResource._Def2("MdxHierarchyName", "hierarchy ''{0}''", (String[])null);
    public final MondrianResource._Def2 MdxDimensionName = new MondrianResource._Def2("MdxDimensionName", "dimension ''{0}''", (String[])null);
    public final MondrianResource._Def2 MdxLevelName = new MondrianResource._Def2("MdxLevelName", "level ''{0}''", (String[])null);
    public final MondrianResource._Def2 MdxMemberName = new MondrianResource._Def2("MdxMemberName", "member ''{0}''", (String[])null);
    public final MondrianResource._Def0 WhileParsingMdx = new MondrianResource._Def0("WhileParsingMdx", "Error while parsing MDX statement ''{0}''", (String[])null);
    public final MondrianResource._Def0 WhileParsingMdxExpression = new MondrianResource._Def0("WhileParsingMdxExpression", "Syntax error in MDX expression ''{0}''", (String[])null);
    public final MondrianResource._Def3 MdxFatalError = new MondrianResource._Def3("MdxFatalError", "MDX parser cannot recover from previous error(s)", (String[])null);
    public final MondrianResource._Def0 FailedToParseQuery = new MondrianResource._Def0("FailedToParseQuery", "Failed to parse query ''{0}''", (String[])null);
    public final MondrianResource._Def0 MdxError = new MondrianResource._Def0("MdxError", "Error: {0}", (String[])null);
    public final MondrianResource._Def0 MdxSyntaxError = new MondrianResource._Def0("MdxSyntaxError", "Syntax error at token ''{0}''", (String[])null);
    public final MondrianResource._Def4 MdxSyntaxErrorAt = new MondrianResource._Def4("MdxSyntaxErrorAt", "Syntax error at line {1}, column {2}, token ''{0}''", (String[])null);
    public final MondrianResource._Def5 MdxFatalSyntaxError = new MondrianResource._Def5("MdxFatalSyntaxError", "Couldn''t repair and continue parse", (String[])null);
    public final MondrianResource._Def4 MdxCubeSlicerMemberError = new MondrianResource._Def4("MdxCubeSlicerMemberError", "Failed to add Cube Slicer with member ''{0}'' for hierarchy ''{1}'' on cube ''{2}''", (String[])null);
    public final MondrianResource._Def1 MdxCubeSlicerHierarchyError = new MondrianResource._Def1("MdxCubeSlicerHierarchyError", "Failed to add Cube Slicer for hierarchy ''{0}'' on cube ''{1}''", (String[])null);
    public final MondrianResource._Def0 MdxInvalidMember = new MondrianResource._Def0("MdxInvalidMember", "Invalid member identifier ''{0}''", (String[])null);
    public final MondrianResource._Def0 MdxCalculatedHierarchyError = new MondrianResource._Def0("MdxCalculatedHierarchyError", "Hierarchy for calculated member ''{0}'' not found", (String[])null);
    public final MondrianResource._Def0 MdxAxisIsNotSet = new MondrianResource._Def0("MdxAxisIsNotSet", "Axis ''{0}'' expression is not a set", (String[])null);
    public final MondrianResource._Def0 MdxMemberExpIsSet = new MondrianResource._Def0("MdxMemberExpIsSet", "Member expression ''{0}'' must not be a set", (String[])null);
    public final MondrianResource._Def0 MdxSetExpNotSet = new MondrianResource._Def0("MdxSetExpNotSet", "Set expression ''{0}'' must be a set", (String[])null);
    public final MondrianResource._Def0 MdxFuncArgumentsNum = new MondrianResource._Def0("MdxFuncArgumentsNum", "Function ''{0}'' must have at least 2 arguments", (String[])null);
    public final MondrianResource._Def6 MdxFuncNotHier = new MondrianResource._Def6("MdxFuncNotHier", "Argument ''{0,number}'' of function ''{1}'' must be a hierarchy", (String[])null);
    public final MondrianResource._Def0 UnknownParameter = new MondrianResource._Def0("UnknownParameter", "Unknown parameter ''{0}''", (String[])null);
    public final MondrianResource._Def4 MdxFormulaNotFound = new MondrianResource._Def4("MdxFormulaNotFound", "Calculated {0} ''{1}'' has not been found in query ''{2}''", (String[])null);
    public final MondrianResource._Def0 MdxCantFindMember = new MondrianResource._Def0("MdxCantFindMember", "Cannot find MDX member ''{0}''. Make sure it is indeed a member and not a level or a hierarchy.", (String[])null);
    public final MondrianResource._Def5 CalculatedMember = new MondrianResource._Def5("CalculatedMember", "calculated member", (String[])null);
    public final MondrianResource._Def5 CalculatedSet = new MondrianResource._Def5("CalculatedSet", "calculated set", (String[])null);
    public final MondrianResource._Def4 MdxCalculatedFormulaUsedOnAxis = new MondrianResource._Def4("MdxCalculatedFormulaUsedOnAxis", "Cannot delete {0} ''{1}''. It is used on {2} axis.", (String[])null);
    public final MondrianResource._Def1 MdxCalculatedFormulaUsedOnSlicer = new MondrianResource._Def1("MdxCalculatedFormulaUsedOnSlicer", "Cannot delete {0} ''{1}''. It is used on slicer.", (String[])null);
    public final MondrianResource._Def7 MdxCalculatedFormulaUsedInFormula = new MondrianResource._Def7("MdxCalculatedFormulaUsedInFormula", "Cannot delete {0} ''{1}''. It is used in definition of {2} ''{3}''.", (String[])null);
    public final MondrianResource._Def4 MdxCalculatedFormulaUsedInQuery = new MondrianResource._Def4("MdxCalculatedFormulaUsedInQuery", "Cannot delete {0} ''{1}''. It is used in query ''{2}''.", (String[])null);
    public final MondrianResource._Def8 MdxAxisShowSubtotalsNotSupported = new MondrianResource._Def8("MdxAxisShowSubtotalsNotSupported", "Show/hide subtotals operation on axis ''{0,number}'' is not supported.", (String[])null);
    public final MondrianResource._Def0 NoFunctionMatchesSignature = new MondrianResource._Def0("NoFunctionMatchesSignature", "No function matches signature ''{0}''", (String[])null);
    public final MondrianResource._Def1 MoreThanOneFunctionMatchesSignature = new MondrianResource._Def1("MoreThanOneFunctionMatchesSignature", "More than one function matches signature ''{0}''; they are: {1}", (String[])null);
    public final MondrianResource._Def1 MemberNotInLevelHierarchy = new MondrianResource._Def1("MemberNotInLevelHierarchy", "The member ''{0}'' is not in the same hierarchy as the level ''{1}''.", (String[])null);
    public final MondrianResource._Def3 ToggleDrillStateRecursiveNotSupported = new MondrianResource._Def3("ToggleDrillStateRecursiveNotSupported", "''RECURSIVE'' is not supported in ToggleDrillState.", (String[])null);
    public final MondrianResource._Def3 CompoundSlicer = new MondrianResource._Def3("CompoundSlicer", "WHERE clause expression returned set with more than one element.", (String[])null);
    public final MondrianResource._Def4 FunctionMbrAndLevelHierarchyMismatch = new MondrianResource._Def4("FunctionMbrAndLevelHierarchyMismatch", "The <level> and <member> arguments to {0} must be from the same hierarchy. The level was from ''{1}'' but the member was from ''{2}''.", (String[])null);
    public final MondrianResource._Def1 CousinHierarchyMismatch = new MondrianResource._Def1("CousinHierarchyMismatch", "The member arguments to the Cousin function must be from the same hierarchy. The members are ''{0}'' and ''{1}''.", (String[])null);
    public final MondrianResource._Def0 HierarchyInIndependentAxes = new MondrianResource._Def0("HierarchyInIndependentAxes", "Hierarchy ''{0}'' appears in more than one independent axis.", (String[])null);
    public final MondrianResource._Def0 ArgsMustHaveSameHierarchy = new MondrianResource._Def0("ArgsMustHaveSameHierarchy", "All arguments to function ''{0}'' must have same hierarchy.", (String[])null);
    public final MondrianResource._Def0 TimeArgNeeded = new MondrianResource._Def0("TimeArgNeeded", "Argument to function ''{0}'' must belong to Time hierarchy.", (String[])null);
    public final MondrianResource._Def8 InvalidAxis = new MondrianResource._Def8("InvalidAxis", "Invalid axis specification. The axis number must be a non-negative integer, but it was {0,number}.", (String[])null);
    public final MondrianResource._Def0 DuplicateAxis = new MondrianResource._Def0("DuplicateAxis", "Duplicate axis name ''{0}''.", (String[])null);
    public final MondrianResource._Def6 NonContiguousAxis = new MondrianResource._Def6("NonContiguousAxis", "Axis numbers specified in a query must be sequentially specified, and cannot contain gaps. Axis {0,number} ({1}) is missing.", (String[])null);
    public final MondrianResource._Def0 DupHierarchiesInTuple = new MondrianResource._Def0("DupHierarchiesInTuple", "Tuple contains more than one member of hierarchy ''{0}''.", (String[])null);
    public final MondrianResource._Def3 VisualTotalsAppliedToTuples = new MondrianResource._Def3("VisualTotalsAppliedToTuples", "Argument to ''VisualTotals'' function must be a set of members; got set of tuples.", (String[])null);
    public final MondrianResource._Def1 ParameterIsNotModifiable = new MondrianResource._Def1("ParameterIsNotModifiable", "Parameter ''{0}'' (defined at ''{1}'' scope) is not modifiable", (String[])null);
    public final MondrianResource._Def0 ParameterDefinedMoreThanOnce = new MondrianResource._Def0("ParameterDefinedMoreThanOnce", "Parameter ''{0}'' is defined more than once in this statement", (String[])null);
    public final MondrianResource._Def0 CycleDuringParameterEvaluation = new MondrianResource._Def0("CycleDuringParameterEvaluation", "Cycle occurred while evaluating parameter ''{0}''", (String[])null);
    public final MondrianResource._Def0 CastInvalidType = new MondrianResource._Def0("CastInvalidType", "Unknown type ''{0}''; values are NUMERIC, STRING, BOOLEAN", (String[])null);
    public final MondrianResource._Def3 NullNotSupported = new MondrianResource._Def3("NullNotSupported", "Function does not support NULL member parameter", (String[])null);
    public final MondrianResource._Def3 TwoNullsNotSupported = new MondrianResource._Def3("TwoNullsNotSupported", "Function does not support two NULL member parameters", (String[])null);
    public final MondrianResource._Def0 NoTimeDimensionInCube = new MondrianResource._Def0("NoTimeDimensionInCube", "Cannot use the function ''{0}'', no time dimension is available for this cube.", (String[])null);
    public final MondrianResource._Def0 CannotImplicitlyConvertDimensionToHierarchy = new MondrianResource._Def0("CannotImplicitlyConvertDimensionToHierarchy", "The ''{0}'' dimension contains more than one hierarchy, therefore the hierarchy must be explicitly specified.", (String[])null);
    public final MondrianResource._Def0 HierarchyHasNoAccessibleMembers = new MondrianResource._Def0("HierarchyHasNoAccessibleMembers", "Hierarchy ''{0}'' has no accessible members.", (String[])null);
    public final MondrianResource._Def3 NullValue = new MondrianResource._Def3("NullValue", "An MDX expression was expected. An empty expression was specified.", (String[])null);
    public final MondrianResource._Def3 AvgRollupFailed = new MondrianResource._Def3("AvgRollupFailed", "Don''t know how to rollup aggregator ''avg'' because the cube doesn''t contain at least one ''count'' and one ''sum'' measures based on the same column.", (String[])null);
    public final MondrianResource._Def0 DrillthroughDisabled = new MondrianResource._Def0("DrillthroughDisabled", "Can''t perform drillthrough operations because ''{0}'' is set to false.", (String[])null);
    public final MondrianResource._Def0 DrillthroughCalculatedMember = new MondrianResource._Def0("DrillthroughCalculatedMember", "Can''t perform drillthrough operations because ''{0}'' is a calculated member.", (String[])null);
    public final MondrianResource._Def1 ConnectStringMandatoryProperties = new MondrianResource._Def1("ConnectStringMandatoryProperties", "Connect string must contain property ''{0}'' or property ''{1}''", (String[])null);
    public final MondrianResource._Def0 NonTimeLevelInTimeHierarchy = new MondrianResource._Def0("NonTimeLevelInTimeHierarchy", "Level ''{0}'' belongs to a time hierarchy, so its level-type must be  ''Years'', ''Quarters'', ''Months'', ''Weeks'' or ''Days''.", (String[])null);
    public final MondrianResource._Def0 TimeLevelInNonTimeHierarchy = new MondrianResource._Def0("TimeLevelInNonTimeHierarchy", "Level ''{0}'' does not belong to a time hierarchy, so its level-type must be ''Standard''.", (String[])null);
    public final MondrianResource._Def1 MustSpecifyPrimaryKeyForHierarchy = new MondrianResource._Def1("MustSpecifyPrimaryKeyForHierarchy", "In usage of hierarchy ''{0}'' in cube ''{1}'', you must specify a primary key.", (String[])null);
    public final MondrianResource._Def0 MustSpecifyPrimaryKeyTableForHierarchy = new MondrianResource._Def0("MustSpecifyPrimaryKeyTableForHierarchy", "Must specify a primary key table for hierarchy ''{0}'', because it has more than one table.", (String[])null);
    public final MondrianResource._Def1 MustSpecifyForeignKeyForHierarchy = new MondrianResource._Def1("MustSpecifyForeignKeyForHierarchy", "In usage of hierarchy ''{0}'' in cube ''{1}'', you must specify a foreign key, because the hierarchy table is different from the fact table.", (String[])null);
    public final MondrianResource._Def0 LevelMustHaveNameExpression = new MondrianResource._Def0("LevelMustHaveNameExpression", "Level ''{0}'' must have a name expression (a ''column'' attribute or an <Expression> child", (String[])null);
    public final MondrianResource._Def0 PublicDimensionMustNotHaveForeignKey = new MondrianResource._Def0("PublicDimensionMustNotHaveForeignKey", "Dimension ''{0}'' has a foreign key. This attribute is only valid in private dimensions and dimension usages.", (String[])null);
    public final MondrianResource._Def0 HierarchyMustNotHaveMoreThanOneSource = new MondrianResource._Def0("HierarchyMustNotHaveMoreThanOneSource", "Hierarchy ''{0}'' has more than one source (memberReaderClass, <Table>, <Join> or <View>)", (String[])null);
    public final MondrianResource._Def4 DimensionUsageHasUnknownLevel = new MondrianResource._Def4("DimensionUsageHasUnknownLevel", "In usage of dimension ''{0}'' in cube ''{1}'', the level ''{2}'' is unknown", (String[])null);
    public final MondrianResource._Def4 CalcMemberHasBadDimension = new MondrianResource._Def4("CalcMemberHasBadDimension", "Unknown dimension ''{0}'' for calculated member ''{1}'' in cube ''{2}''", (String[])null);
    public final MondrianResource._Def1 CalcMemberHasBothDimensionAndHierarchy = new MondrianResource._Def1("CalcMemberHasBothDimensionAndHierarchy", "Cannot specify both a dimension and hierarchy for calculated member ''{0}'' in cube ''{1}''", (String[])null);
    public final MondrianResource._Def4 CalcMemberHasUnknownParent = new MondrianResource._Def4("CalcMemberHasUnknownParent", "Cannot find a parent with name ''{0}'' for calculated member ''{1}'' in cube ''{2}''", (String[])null);
    public final MondrianResource._Def4 CalcMemberHasDifferentParentAndHierarchy = new MondrianResource._Def4("CalcMemberHasDifferentParentAndHierarchy", "The calculated member ''{0}'' in cube ''{1}'' is defined for hierarchy ''{2}'' but its parent member is not part of that hierarchy", (String[])null);
    public final MondrianResource._Def1 CalcMemberNotUnique = new MondrianResource._Def1("CalcMemberNotUnique", "Calculated member ''{0}'' already exists in cube ''{1}''", (String[])null);
    public final MondrianResource._Def4 NeitherExprNorValueForCalcMemberProperty = new MondrianResource._Def4("NeitherExprNorValueForCalcMemberProperty", "Member property must have a value or an expression. (Property ''{0}'' of member ''{1}'' of cube ''{2}''.)", (String[])null);
    public final MondrianResource._Def4 ExprAndValueForMemberProperty = new MondrianResource._Def4("ExprAndValueForMemberProperty", "Member property must not have both a value and an expression. (Property ''{0}'' of member ''{1}'' of cube ''{2}''.)", (String[])null);
    public final MondrianResource._Def1 MemberFormatterLoadFailed = new MondrianResource._Def1("MemberFormatterLoadFailed", "Failed to load formatter class ''{0}'' for level ''{1}''.", (String[])null);
    public final MondrianResource._Def1 CellFormatterLoadFailed = new MondrianResource._Def1("CellFormatterLoadFailed", "Failed to load formatter class ''{0}'' for member ''{1}''.", (String[])null);
    public final MondrianResource._Def1 PropertyFormatterLoadFailed = new MondrianResource._Def1("PropertyFormatterLoadFailed", "Failed to load formatter class ''{0}'' for property ''{1}''.", (String[])null);
    public final MondrianResource._Def1 HierarchyMustHaveForeignKey = new MondrianResource._Def1("HierarchyMustHaveForeignKey", "Hierarchy ''{0}'' in cube ''{1}'' must have a foreign key, since it is not based on the cube''s fact table.", (String[])null);
    public final MondrianResource._Def4 HierarchyInvalidForeignKey = new MondrianResource._Def4("HierarchyInvalidForeignKey", "Foreign key ''{0}'' of hierarchy ''{1}'' in cube ''{2}'' is not a column in the fact table.", (String[])null);
    public final MondrianResource._Def1 UdfClassNotFound = new MondrianResource._Def1("UdfClassNotFound", "Failed to load user-defined function ''{0}'': class ''{1}'' not found", (String[])null);
    public final MondrianResource._Def1 UdfClassMustBePublicAndStatic = new MondrianResource._Def1("UdfClassMustBePublicAndStatic", "Failed to load user-defined function ''{0}'': class ''{1}'' must be public and static", (String[])null);
    public final MondrianResource._Def4 UdfClassWrongIface = new MondrianResource._Def4("UdfClassWrongIface", "Failed to load user-defined function ''{0}'': class ''{1}'' does not implement the required interface ''{2}''", (String[])null);
    public final MondrianResource._Def0 UdfDuplicateName = new MondrianResource._Def0("UdfDuplicateName", "Duplicate user-defined function ''{0}''", (String[])null);
    public final MondrianResource._Def1 NamedSetNotUnique = new MondrianResource._Def1("NamedSetNotUnique", "Named set ''{0}'' already exists in cube ''{1}''", (String[])null);
    public final MondrianResource._Def0 UnknownNamedSetHasBadFormula = new MondrianResource._Def0("UnknownNamedSetHasBadFormula", "Named set in cube ''{0}'' has bad formula", (String[])null);
    public final MondrianResource._Def0 NamedSetHasBadFormula = new MondrianResource._Def0("NamedSetHasBadFormula", "Named set ''{0}'' has bad formula", (String[])null);
    public final MondrianResource._Def7 MeasureOrdinalsNotUnique = new MondrianResource._Def7("MeasureOrdinalsNotUnique", "Cube ''{0}'': Ordinal {1} is not unique: ''{2}'' and ''{3}''", (String[])null);
    public final MondrianResource._Def1 BadMeasureSource = new MondrianResource._Def1("BadMeasureSource", "Cube ''{0}'': Measure ''{1}'' must contain either a source column or a source expression, but not both", (String[])null);
    public final MondrianResource._Def0 DuplicateSchemaParameter = new MondrianResource._Def0("DuplicateSchemaParameter", "Duplicate parameter ''{0}'' in schema", (String[])null);
    public final MondrianResource._Def1 UnknownAggregator = new MondrianResource._Def1("UnknownAggregator", "Unknown aggregator ''{0}''; valid aggregators are: {1}", (String[])null);
    public final MondrianResource._Def3 RoleUnionGrants = new MondrianResource._Def3("RoleUnionGrants", "Union role must not contain grants", (String[])null);
    public final MondrianResource._Def0 UnknownRole = new MondrianResource._Def0("UnknownRole", "Unknown role ''{0}''", (String[])null);
    public final MondrianResource._Def3 DescendantsAppliedToSetOfTuples = new MondrianResource._Def3("DescendantsAppliedToSetOfTuples", "Argument to Descendants function must be a member or set of members, not a set of tuples", (String[])null);
    public final MondrianResource._Def3 CannotDeduceTypeOfSet = new MondrianResource._Def3("CannotDeduceTypeOfSet", "Cannot deduce type of set", (String[])null);
    public final MondrianResource._Def3 NotANamedSet = new MondrianResource._Def3("NotANamedSet", "Not a named set", (String[])null);
    public final MondrianResource._Def0 HierarchyHasNoLevels = new MondrianResource._Def0("HierarchyHasNoLevels", "Hierarchy ''{0}'' must have at least one level.", (String[])null);
    public final MondrianResource._Def1 HierarchyLevelNamesNotUnique = new MondrianResource._Def1("HierarchyLevelNamesNotUnique", "Level names within hierarchy ''{0}'' are not unique; there is more than one level with name ''{1}''.", (String[])null);
    public final MondrianResource._Def3 IllegalLeftDeepJoin = new MondrianResource._Def3("IllegalLeftDeepJoin", "Left side of join must not be a join; mondrian only supports right-deep joins.", (String[])null);
    public final MondrianResource._Def9 LevelTableParentNotFound = new MondrianResource._Def9("LevelTableParentNotFound", "The level {0} makes use of the ''parentColumn'' attribute, but a parent member for key {1} is missing. This can be due to the usage of the NativizeSet MDX function with a list of members form a parent-child hierarchy that doesn''t include all parent members in its definition. Using NativizeSet with a parent-child hierarchy requires the parent members to be included in the set, or the hierarchy cannot be properly built natively.", (String[])null);
    public final MondrianResource._Def0 CreateTableFailed = new MondrianResource._Def0("CreateTableFailed", "Mondrian loader could not create table ''{0}''.", (String[])null);
    public final MondrianResource._Def1 CreateIndexFailed = new MondrianResource._Def1("CreateIndexFailed", "Mondrian loader could not create index ''{0}'' on table ''{1}''.", (String[])null);
    public final MondrianResource._Def0 MissingArg = new MondrianResource._Def0("MissingArg", "Argument ''{0}'' must be specified.", (String[])null);
    public final MondrianResource._Def6 InvalidInsertLine = new MondrianResource._Def6("InvalidInsertLine", "Input line is not a valid INSERT statement; line {0,number}: {1}.", (String[])null);
    public final MondrianResource._Def10 LimitExceededDuringCrossjoin = new MondrianResource._Def10("LimitExceededDuringCrossjoin", "Size of CrossJoin result ({0,number}) exceeded limit ({1,number})", (String[])null);
    public final MondrianResource._Def10 TotalMembersLimitExceeded = new MondrianResource._Def10("TotalMembersLimitExceeded", "Total number of Members in result ({0,number}) exceeded limit ({1,number})", (String[])null);
    public final MondrianResource._Def11 MemberFetchLimitExceeded = new MondrianResource._Def11("MemberFetchLimitExceeded", "Number of members to be read exceeded limit ({0,number})", (String[])null);
    public final MondrianResource._Def11 SegmentFetchLimitExceeded = new MondrianResource._Def11("SegmentFetchLimitExceeded", "Number of cell results to be read exceeded limit of ({0,number})", (String[])null);
    public final MondrianResource._Def12 QueryCanceled = new MondrianResource._Def12("QueryCanceled", "Query canceled", (String[])null);
    public final MondrianResource._Def13 QueryTimeout = new MondrianResource._Def13("QueryTimeout", "Query timeout of {0,number} seconds reached", (String[])null);
    public final MondrianResource._Def11 IterationLimitExceeded = new MondrianResource._Def11("IterationLimitExceeded", "Number of iterations exceeded limit of {0,number}", (String[])null);
    public final MondrianResource._Def14 InvalidHierarchyCondition = new MondrianResource._Def14("InvalidHierarchyCondition", "Hierarchy ''{0}'' is invalid (has no members)", (String[])null);
    public final MondrianResource._Def15 TooManyMessageRecorderErrors = new MondrianResource._Def15("TooManyMessageRecorderErrors", "Context ''{0}'': Exceeded number of allowed errors ''{1,number}''", (String[])null);
    public final MondrianResource._Def15 ForceMessageRecorderError = new MondrianResource._Def15("ForceMessageRecorderError", "Context ''{0}'': Client forcing return with errors ''{1,number}''", (String[])null);
    public final MondrianResource._Def16 UnknownLevelName = new MondrianResource._Def16("UnknownLevelName", "Context ''{0}'': The Hierarchy Level ''{1}'' does not have a Level named ''{2}''", (String[])null);
    public final MondrianResource._Def9 DuplicateLevelNames = new MondrianResource._Def9("DuplicateLevelNames", "Context ''{0}'': Two levels share the same name ''{1}''", (String[])null);
    public final MondrianResource._Def17 DuplicateLevelColumnNames = new MondrianResource._Def17("DuplicateLevelColumnNames", "Context ''{0}'': Two levels, ''{1}'' and ''{2}'',  share the same foreign column name ''{3}''", (String[])null);
    public final MondrianResource._Def17 DuplicateMeasureColumnNames = new MondrianResource._Def17("DuplicateMeasureColumnNames", "Context ''{0}'': Two measures, ''{1}'' and ''{2}'',  share the same column name ''{3}''", (String[])null);
    public final MondrianResource._Def17 DuplicateLevelMeasureColumnNames = new MondrianResource._Def17("DuplicateLevelMeasureColumnNames", "Context ''{0}'': The level ''{1}'' and the measuer ''{2}'',  share the same column name ''{3}''", (String[])null);
    public final MondrianResource._Def9 DuplicateMeasureNames = new MondrianResource._Def9("DuplicateMeasureNames", "Context ''{0}'': Two measures share the same name ''{1}''", (String[])null);
    public final MondrianResource._Def16 DuplicateFactForeignKey = new MondrianResource._Def16("DuplicateFactForeignKey", "Context ''{0}'': Duplicate fact foreign keys ''{1}'' for key ''{2}''.", (String[])null);
    public final MondrianResource._Def16 UnknownLeftJoinCondition = new MondrianResource._Def16("UnknownLeftJoinCondition", "Context ''{0}'': Failed to find left join condition in fact table ''{1}'' for foreign key ''{2}''.", (String[])null);
    public final MondrianResource._Def9 UnknownHierarchyName = new MondrianResource._Def9("UnknownHierarchyName", "Context ''{0}'': The Hierarchy ''{1}'' does not exist\"", (String[])null);
    public final MondrianResource._Def9 BadLevelNameFormat = new MondrianResource._Def9("BadLevelNameFormat", "Context ''{0}'': The Level name ''{1}'' should be [usage hierarchy name].[level name].", (String[])null);
    public final MondrianResource._Def9 BadMeasureNameFormat = new MondrianResource._Def9("BadMeasureNameFormat", "Context ''{0}'': The Measures name ''{1}'' should be [Measures].[measure name].", (String[])null);
    public final MondrianResource._Def9 BadMeasures = new MondrianResource._Def9("BadMeasures", "Context ''{0}'': This name ''{1}'' must be the string \"Measures\".", (String[])null);
    public final MondrianResource._Def9 UnknownMeasureName = new MondrianResource._Def9("UnknownMeasureName", "Context ''{0}'': Measures does not have a measure named ''{1}''", (String[])null);
    public final MondrianResource._Def9 NullAttributeString = new MondrianResource._Def9("NullAttributeString", "Context ''{0}'': The value for the attribute ''{1}'' is null.", (String[])null);
    public final MondrianResource._Def9 EmptyAttributeString = new MondrianResource._Def9("EmptyAttributeString", "Context ''{0}'': The value for the attribute ''{1}'' is empty (length is zero).", (String[])null);
    public final MondrianResource._Def0 MissingDefaultAggRule = new MondrianResource._Def0("MissingDefaultAggRule", "There is no default aggregate recognition rule with tag ''{0}''.", (String[])null);
    public final MondrianResource._Def0 AggRuleParse = new MondrianResource._Def0("AggRuleParse", "Error while parsing default aggregate recognition ''{0}''.", (String[])null);
    public final MondrianResource._Def16 BadMeasureName = new MondrianResource._Def16("BadMeasureName", "Context ''{0}'': Failed to find Measure name ''{1}'' for cube ''{2}''.", (String[])null);
    public final MondrianResource._Def16 BadRolapStarLeftJoinCondition = new MondrianResource._Def16("BadRolapStarLeftJoinCondition", "Context ''{0}'': Bad RolapStar left join condition type: ''{1}'' ''{2}''.", (String[])null);
    public final MondrianResource._Def9 SqlQueryFailed = new MondrianResource._Def9("SqlQueryFailed", "Context ''{0}'': Sql query failed to run ''{1}''.", (String[])null);
    public final MondrianResource._Def3 AggLoadingError = new MondrianResource._Def3("AggLoadingError", "Error while loading/reloading aggregates.", (String[])null);
    public final MondrianResource._Def8 AggLoadingExceededErrorCount = new MondrianResource._Def8("AggLoadingExceededErrorCount", "Too many errors, ''{0,number}'', while loading/reloading aggregates.", (String[])null);
    public final MondrianResource._Def16 UnknownFactTableColumn = new MondrianResource._Def16("UnknownFactTableColumn", "Context ''{0}'': For Fact table ''{1}'', the column ''{2}'' is neither a measure or foreign key\".", (String[])null);
    public final MondrianResource._Def18 AggMultipleMatchingMeasure = new MondrianResource._Def18("AggMultipleMatchingMeasure", "Context ''{0}'': Candidate aggregate table ''{1}'' for fact table ''{2}'' has ''{3,number}'' columns matching measure ''{4}'', ''{5}'', ''{6}''\".", (String[])null);
    public final MondrianResource._Def2 CouldNotLoadDefaultAggregateRules = new MondrianResource._Def2("CouldNotLoadDefaultAggregateRules", "Could not load default aggregate rules ''{0}''.", (String[])null);
    public final MondrianResource._Def9 FailedCreateNewDefaultAggregateRules = new MondrianResource._Def9("FailedCreateNewDefaultAggregateRules", "Failed to create new default aggregate rules using property ''{0}'' with value ''{1}''.", (String[])null);
    public final MondrianResource._Def9 CubeRelationNotTable = new MondrianResource._Def9("CubeRelationNotTable", "The Cube ''{0}'' relation is not a MondrianDef.Table but rather ''{1}''.", (String[])null);
    public final MondrianResource._Def4 AttemptToChangeTableUsage = new MondrianResource._Def4("AttemptToChangeTableUsage", "JdbcSchema.Table ''{0}'' already set to usage ''{1}'' and can not be reset to usage ''{2}''.", (String[])null);
    public final MondrianResource._Def0 BadJdbcFactoryClassName = new MondrianResource._Def0("BadJdbcFactoryClassName", "JdbcSchema Factory classname ''{0}'', class not found.", (String[])null);
    public final MondrianResource._Def0 BadJdbcFactoryInstantiation = new MondrianResource._Def0("BadJdbcFactoryInstantiation", "JdbcSchema Factory classname ''{0}'', can not instantiate.", (String[])null);
    public final MondrianResource._Def0 BadJdbcFactoryAccess = new MondrianResource._Def0("BadJdbcFactoryAccess", "JdbcSchema Factory classname ''{0}'', illegal access.", (String[])null);
    public final MondrianResource._Def17 NonNumericFactCountColumn = new MondrianResource._Def17("NonNumericFactCountColumn", "Candidate aggregate table ''{0}'' for fact table ''{1}'' has candidate fact count column ''{2}'' has type ''{3}'' that is not numeric.", (String[])null);
    public final MondrianResource._Def19 TooManyFactCountColumns = new MondrianResource._Def19("TooManyFactCountColumns", "Candidate aggregate table ''{0}'' for fact table ''{1}'' has ''{2,number}'' fact count columns.", (String[])null);
    public final MondrianResource._Def9 NoFactCountColumns = new MondrianResource._Def9("NoFactCountColumns", "Candidate aggregate table ''{0}'' for fact table ''{1}'' has no fact count columns.", (String[])null);
    public final MondrianResource._Def9 NoMeasureColumns = new MondrianResource._Def9("NoMeasureColumns", "Candidate aggregate table ''{0}'' for fact table ''{1}'' has no measure columns.", (String[])null);
    public final MondrianResource._Def20 TooManyMatchingForeignKeyColumns = new MondrianResource._Def20("TooManyMatchingForeignKeyColumns", "Candidate aggregate table ''{0}'' for fact table ''{1}'' had ''{2,number}'' columns matching foreign key ''{3}''", (String[])null);
    public final MondrianResource._Def21 DoubleMatchForLevel = new MondrianResource._Def21("DoubleMatchForLevel", "Double Match for candidate aggregate table ''{0}'' for fact table ''{1}'' and column ''{2}'' matched two hierarchies: 1) table=''{3}'', column=''{4}'' and 2) table=''{5}'', column=''{6}''", (String[])null);
    public final MondrianResource._Def16 AggUnknownColumn = new MondrianResource._Def16("AggUnknownColumn", "Candidate aggregate table ''{0}'' for fact table ''{1}'' has a column ''{2}'' with unknown usage.", (String[])null);
    public final MondrianResource._Def16 NoAggregatorFound = new MondrianResource._Def16("NoAggregatorFound", "No aggregator found while converting fact table aggregator: for usage\n        ''{0}'', fact aggregator ''{1}'' and sibling aggregator ''{2}''", (String[])null);
    public final MondrianResource._Def2 NoColumnNameFromExpression = new MondrianResource._Def2("NoColumnNameFromExpression", "Could not get a column name from a level key expression: ''{0}''.", (String[])null);
    public final MondrianResource._Def9 AggTableZeroSize = new MondrianResource._Def9("AggTableZeroSize", "Zero size Aggregate table ''{0}'' for Fact Table ''{1}''.", (String[])null);
    public final MondrianResource._Def3 CacheFlushRegionMustContainMembers = new MondrianResource._Def3("CacheFlushRegionMustContainMembers", "Region of cells to be flushed must contain measures.", (String[])null);
    public final MondrianResource._Def1 CacheFlushUnionDimensionalityMismatch = new MondrianResource._Def1("CacheFlushUnionDimensionalityMismatch", "Cannot union cell regions of different dimensionalities. (Dimensionalities are ''{0}'', ''{1}''.)", (String[])null);
    public final MondrianResource._Def0 CacheFlushCrossjoinDimensionsInCommon = new MondrianResource._Def0("CacheFlushCrossjoinDimensionsInCommon", "Cannot crossjoin cell regions which have dimensions in common. (Dimensionalities are {0}.)", (String[])null);
    public final MondrianResource._Def3 SegmentCacheIsNotImplementingInterface = new MondrianResource._Def3("SegmentCacheIsNotImplementingInterface", "The mondrian.rolap.SegmentCache property points to a class name which is not an\n        implementation of mondrian.spi.SegmentCache.", (String[])null);
    public final MondrianResource._Def3 SegmentCacheFailedToInstanciate = new MondrianResource._Def3("SegmentCacheFailedToInstanciate", "An exception was encountered while creating the SegmentCache.", (String[])null);
    public final MondrianResource._Def3 SegmentCacheFailedToLoadSegment = new MondrianResource._Def3("SegmentCacheFailedToLoadSegment", "An exception was encountered while loading a segment from the SegmentCache.", (String[])null);
    public final MondrianResource._Def3 SegmentCacheFailedToSaveSegment = new MondrianResource._Def3("SegmentCacheFailedToSaveSegment", "An exception was encountered while loading a segment from the SegmentCache.", (String[])null);
    public final MondrianResource._Def3 SegmentCacheFailedToLookupSegment = new MondrianResource._Def3("SegmentCacheFailedToLookupSegment", "An exception was encountered while performing a segment lookup in the SegmentCache.", (String[])null);
    public final MondrianResource._Def3 SegmentCacheFailedToScanSegments = new MondrianResource._Def3("SegmentCacheFailedToScanSegments", "An exception was encountered while getting a list of segment headers in the SegmentCache.", (String[])null);
    public final MondrianResource._Def3 SegmentCacheFailedToDeleteSegment = new MondrianResource._Def3("SegmentCacheFailedToDeleteSegment", "An exception was encountered while deleting a segment from the SegmentCache.", (String[])null);
    public final MondrianResource._Def3 SegmentCacheReadTimeout = new MondrianResource._Def3("SegmentCacheReadTimeout", "Timeout reached while reading segment from SegmentCache.", (String[])null);
    public final MondrianResource._Def3 SegmentCacheWriteTimeout = new MondrianResource._Def3("SegmentCacheWriteTimeout", "Timeout reached while writing segment to SegmentCache.", (String[])null);
    public final MondrianResource._Def3 SegmentCacheLookupTimeout = new MondrianResource._Def3("SegmentCacheLookupTimeout", "Timeout reached while performing a segment lookup in SegmentCache.", (String[])null);
    public final MondrianResource._Def22 NativeEvaluationUnsupported = new MondrianResource._Def22("NativeEvaluationUnsupported", "Native evaluation not supported for this usage of function ''{0}''", (String[])null);
    public final MondrianResource._Def9 NativeSqlInClauseTooLarge = new MondrianResource._Def9("NativeSqlInClauseTooLarge", "Cannot use native aggregation constraints for level ''{0}'' because the number of members is larger than the value of ''mondrian.rolap.maxConstraints'' ({1})", (String[])null);
    public final MondrianResource._Def0 ExecutionStatementCleanupException = new MondrianResource._Def0("ExecutionStatementCleanupException", "An exception was encountered while trying to cleanup an execution context. A statement failed to cancel gracefully. Locus was : \"{0}\".", (String[])null);
    public final MondrianResource._Def6 QueryLimitReached = new MondrianResource._Def6("QueryLimitReached", "The number of concurrent MDX statements that can be processed simultaneously by this Mondrian server instance ({0,number}) has been reached. To change the limit, set the ''{1}'' property.", (String[])null);
    public final MondrianResource._Def3 SqlQueryLimitReached = new MondrianResource._Def3("SqlQueryLimitReached", "The number of concurrent SQL statements which can be used simultaneously by this Mondrian server instance has been reached. Set ''mondrian.rolap.maxSqlQueryThreads'' to change the current limit.", (String[])null);
    public final MondrianResource._Def3 SegmentCacheLimitReached = new MondrianResource._Def3("SegmentCacheLimitReached", "The number of concurrent segment cache operations which can be run simultaneously by this Mondrian server instance has been reached. Set ''mondrian.rolap.maxCacheThreads'' to change the current limit.", (String[])null);
    public final MondrianResource._Def3 FinalizerErrorRolapSchema = new MondrianResource._Def3("FinalizerErrorRolapSchema", "An exception was encountered while finalizing a RolapSchema object instance.", (String[])null);
    public final MondrianResource._Def3 FinalizerErrorMondrianServerImpl = new MondrianResource._Def3("FinalizerErrorMondrianServerImpl", "An exception was encountered while finalizing a RolapSchema object instance.", (String[])null);
    public final MondrianResource._Def3 FinalizerErrorRolapConnection = new MondrianResource._Def3("FinalizerErrorRolapConnection", "An exception was encountered while finalizing a RolapConnection object instance.", (String[])null);

    public MondrianResource() throws IOException {
    }

    public static synchronized MondrianResource instance() {
        return (MondrianResource)instance("mondrian.resource.MondrianResource", getThreadOrDefaultLocale(), ResourceBundle.getBundle("mondrian.resource.MondrianResource", getThreadOrDefaultLocale()));
    }

    public static synchronized MondrianResource instance(Locale locale) {
        return (MondrianResource)instance("mondrian.resource.MondrianResource", locale, ResourceBundle.getBundle("mondrian.resource.MondrianResource", locale));
    }

    public final class _Def22 extends ResourceDefinition {
        _Def22(String key, String baseMessage, String[] props) {
            super(key, baseMessage, props);
        }

        public String str(String p0) {
            return this.instantiate(MondrianResource.this, new Object[]{p0}).toString();
        }

        public NativeEvaluationUnsupportedException ex(String p0) {
            return new NativeEvaluationUnsupportedException(this.instantiate(MondrianResource.this, new Object[]{p0}).toString());
        }
    }

    public final class _Def21 extends ResourceDefinition {
        _Def21(String key, String baseMessage, String[] props) {
            super(key, baseMessage, props);
        }

        public String str(String p0, String p1, String p2, String p3, String p4, String p5, String p6) {
            return this.instantiate(MondrianResource.this, new Object[]{p0, p1, p2, p3, p4, p5, p6}).toString();
        }
    }

    public final class _Def20 extends ResourceDefinition {
        _Def20(String key, String baseMessage, String[] props) {
            super(key, baseMessage, props);
        }

        public String str(String p0, String p1, Number p2, String p3) {
            return this.instantiate(MondrianResource.this, new Object[]{p0, p1, p2, p3}).toString();
        }
    }

    public final class _Def19 extends ResourceDefinition {
        _Def19(String key, String baseMessage, String[] props) {
            super(key, baseMessage, props);
        }

        public String str(String p0, String p1, Number p2) {
            return this.instantiate(MondrianResource.this, new Object[]{p0, p1, p2}).toString();
        }
    }

    public final class _Def18 extends ResourceDefinition {
        _Def18(String key, String baseMessage, String[] props) {
            super(key, baseMessage, props);
        }

        public String str(String p0, String p1, String p2, Number p3, String p4, String p5, String p6) {
            return this.instantiate(MondrianResource.this, new Object[]{p0, p1, p2, p3, p4, p5, p6}).toString();
        }
    }

    public final class _Def17 extends ResourceDefinition {
        _Def17(String key, String baseMessage, String[] props) {
            super(key, baseMessage, props);
        }

        public String str(String p0, String p1, String p2, String p3) {
            return this.instantiate(MondrianResource.this, new Object[]{p0, p1, p2, p3}).toString();
        }
    }

    public final class _Def16 extends ResourceDefinition {
        _Def16(String key, String baseMessage, String[] props) {
            super(key, baseMessage, props);
        }

        public String str(String p0, String p1, String p2) {
            return this.instantiate(MondrianResource.this, new Object[]{p0, p1, p2}).toString();
        }
    }

    public final class _Def15 extends ResourceDefinition {
        _Def15(String key, String baseMessage, String[] props) {
            super(key, baseMessage, props);
        }

        public String str(String p0, Number p1) {
            return this.instantiate(MondrianResource.this, new Object[]{p0, p1}).toString();
        }
    }

    public final class _Def14 extends ResourceDefinition {
        _Def14(String key, String baseMessage, String[] props) {
            super(key, baseMessage, props);
        }

        public String str(String p0) {
            return this.instantiate(MondrianResource.this, new Object[]{p0}).toString();
        }

        public InvalidHierarchyException ex(String p0) {
            return new InvalidHierarchyException(this.instantiate(MondrianResource.this, new Object[]{p0}).toString());
        }
    }

    public final class _Def13 extends ResourceDefinition {
        _Def13(String key, String baseMessage, String[] props) {
            super(key, baseMessage, props);
        }

        public String str(Number p0) {
            return this.instantiate(MondrianResource.this, new Object[]{p0}).toString();
        }

        public QueryTimeoutException ex(Number p0) {
            return new QueryTimeoutException(this.instantiate(MondrianResource.this, new Object[]{p0}).toString());
        }
    }

    public final class _Def12 extends ResourceDefinition {
        _Def12(String key, String baseMessage, String[] props) {
            super(key, baseMessage, props);
        }

        public String str() {
            return this.instantiate(MondrianResource.this, MondrianResource.emptyObjectArray).toString();
        }

        public QueryCanceledException ex() {
            return new QueryCanceledException(this.instantiate(MondrianResource.this, MondrianResource.emptyObjectArray).toString());
        }
    }

    public final class _Def11 extends ResourceDefinition {
        _Def11(String key, String baseMessage, String[] props) {
            super(key, baseMessage, props);
        }

        public String str(Number p0) {
            return this.instantiate(MondrianResource.this, new Object[]{p0}).toString();
        }

        public ResourceLimitExceededException ex(Number p0) {
            return new ResourceLimitExceededException(this.instantiate(MondrianResource.this, new Object[]{p0}).toString());
        }
    }

    public final class _Def10 extends ResourceDefinition {
        _Def10(String key, String baseMessage, String[] props) {
            super(key, baseMessage, props);
        }

        public String str(Number p0, Number p1) {
            return this.instantiate(MondrianResource.this, new Object[]{p0, p1}).toString();
        }

        public ResourceLimitExceededException ex(Number p0, Number p1) {
            return new ResourceLimitExceededException(this.instantiate(MondrianResource.this, new Object[]{p0, p1}).toString());
        }
    }

    public final class _Def9 extends ResourceDefinition {
        _Def9(String key, String baseMessage, String[] props) {
            super(key, baseMessage, props);
        }

        public String str(String p0, String p1) {
            return this.instantiate(MondrianResource.this, new Object[]{p0, p1}).toString();
        }
    }

    public final class _Def8 extends ResourceDefinition {
        _Def8(String key, String baseMessage, String[] props) {
            super(key, baseMessage, props);
        }

        public String str(Number p0) {
            return this.instantiate(MondrianResource.this, new Object[]{p0}).toString();
        }

        public MondrianException ex(Number p0) {
            return new MondrianException(this.instantiate(MondrianResource.this, new Object[]{p0}).toString());
        }

        public MondrianException ex(Number p0, Throwable err) {
            return new MondrianException(this.instantiate(MondrianResource.this, new Object[]{p0}).toString(), err);
        }
    }

    public final class _Def7 extends ResourceDefinition {
        _Def7(String key, String baseMessage, String[] props) {
            super(key, baseMessage, props);
        }

        public String str(String p0, String p1, String p2, String p3) {
            return this.instantiate(MondrianResource.this, new Object[]{p0, p1, p2, p3}).toString();
        }

        public MondrianException ex(String p0, String p1, String p2, String p3) {
            return new MondrianException(this.instantiate(MondrianResource.this, new Object[]{p0, p1, p2, p3}).toString());
        }

        public MondrianException ex(String p0, String p1, String p2, String p3, Throwable err) {
            return new MondrianException(this.instantiate(MondrianResource.this, new Object[]{p0, p1, p2, p3}).toString(), err);
        }
    }

    public final class _Def6 extends ResourceDefinition {
        _Def6(String key, String baseMessage, String[] props) {
            super(key, baseMessage, props);
        }

        public String str(Number p0, String p1) {
            return this.instantiate(MondrianResource.this, new Object[]{p0, p1}).toString();
        }

        public MondrianException ex(Number p0, String p1) {
            return new MondrianException(this.instantiate(MondrianResource.this, new Object[]{p0, p1}).toString());
        }

        public MondrianException ex(Number p0, String p1, Throwable err) {
            return new MondrianException(this.instantiate(MondrianResource.this, new Object[]{p0, p1}).toString(), err);
        }
    }

    public final class _Def5 extends ResourceDefinition {
        _Def5(String key, String baseMessage, String[] props) {
            super(key, baseMessage, props);
        }

        public String str() {
            return this.instantiate(MondrianResource.this, MondrianResource.emptyObjectArray).toString();
        }
    }

    public final class _Def4 extends ResourceDefinition {
        _Def4(String key, String baseMessage, String[] props) {
            super(key, baseMessage, props);
        }

        public String str(String p0, String p1, String p2) {
            return this.instantiate(MondrianResource.this, new Object[]{p0, p1, p2}).toString();
        }

        public MondrianException ex(String p0, String p1, String p2) {
            return new MondrianException(this.instantiate(MondrianResource.this, new Object[]{p0, p1, p2}).toString());
        }

        public MondrianException ex(String p0, String p1, String p2, Throwable err) {
            return new MondrianException(this.instantiate(MondrianResource.this, new Object[]{p0, p1, p2}).toString(), err);
        }
    }

    public final class _Def3 extends ResourceDefinition {
        _Def3(String key, String baseMessage, String[] props) {
            super(key, baseMessage, props);
        }

        public String str() {
            return this.instantiate(MondrianResource.this, MondrianResource.emptyObjectArray).toString();
        }

        public MondrianException ex() {
            return new MondrianException(this.instantiate(MondrianResource.this, MondrianResource.emptyObjectArray).toString());
        }

        public MondrianException ex(Throwable err) {
            return new MondrianException(this.instantiate(MondrianResource.this, MondrianResource.emptyObjectArray).toString(), err);
        }
    }

    public final class _Def2 extends ResourceDefinition {
        _Def2(String key, String baseMessage, String[] props) {
            super(key, baseMessage, props);
        }

        public String str(String p0) {
            return this.instantiate(MondrianResource.this, new Object[]{p0}).toString();
        }
    }

    public final class _Def1 extends ResourceDefinition {
        _Def1(String key, String baseMessage, String[] props) {
            super(key, baseMessage, props);
        }

        public String str(String p0, String p1) {
            return this.instantiate(MondrianResource.this, new Object[]{p0, p1}).toString();
        }

        public MondrianException ex(String p0, String p1) {
            return new MondrianException(this.instantiate(MondrianResource.this, new Object[]{p0, p1}).toString());
        }

        public MondrianException ex(String p0, String p1, Throwable err) {
            return new MondrianException(this.instantiate(MondrianResource.this, new Object[]{p0, p1}).toString(), err);
        }
    }

    public final class _Def0 extends ResourceDefinition {
        _Def0(String key, String baseMessage, String[] props) {
            super(key, baseMessage, props);
        }

        public String str(String p0) {
            return this.instantiate(MondrianResource.this, new Object[]{p0}).toString();
        }

        public MondrianException ex(String p0) {
            return new MondrianException(this.instantiate(MondrianResource.this, new Object[]{p0}).toString());
        }

        public MondrianException ex(String p0, Throwable err) {
            return new MondrianException(this.instantiate(MondrianResource.this, new Object[]{p0}).toString(), err);
        }
    }
}
