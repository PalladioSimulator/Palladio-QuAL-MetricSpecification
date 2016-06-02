/**
 */
package org.palladiosimulator.metricspec.impl;

import javax.measure.quantity.Quantity;
import javax.measure.unit.Unit;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.palladiosimulator.metricspec.AggregationFunctionDescription;
import org.palladiosimulator.metricspec.BaseMetricDescription;
import org.palladiosimulator.metricspec.CaptureType;
import org.palladiosimulator.metricspec.DataType;
import org.palladiosimulator.metricspec.Description;
import org.palladiosimulator.metricspec.Identifier;
import org.palladiosimulator.metricspec.MetricDescription;
import org.palladiosimulator.metricspec.MetricDescriptionRepository;
import org.palladiosimulator.metricspec.MetricSetDescription;
import org.palladiosimulator.metricspec.MetricSpecFactory;
import org.palladiosimulator.metricspec.MetricSpecPackage;
import org.palladiosimulator.metricspec.NumericalBaseMetricDescription;
import org.palladiosimulator.metricspec.PersistenceKindOptions;
import org.palladiosimulator.metricspec.Scale;
import org.palladiosimulator.metricspec.ScopeOfValidity;
import org.palladiosimulator.metricspec.TextualBaseMetricDescription;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class MetricSpecPackageImpl extends EPackageImpl implements MetricSpecPackage {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass identifierEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass textualBaseMetricDescriptionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass baseMetricDescriptionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass metricDescriptionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass descriptionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass aggregationFunctionDescriptionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass metricSetDescriptionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass numericalBaseMetricDescriptionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass ijsQuantityEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass metricDescriptionRepositoryEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EEnum captureTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EEnum scaleEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EEnum persistenceKindOptionsEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EEnum dataTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EEnum scopeOfValidityEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EDataType ejsUnitEDataType = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package package URI
     * value.
     * <p>
     * Note: the correct way to create the package is via the static factory method {@link #init
     * init()}, which also performs initialization of the package, or returns the registered
     * package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.palladiosimulator.metricspec.MetricSpecPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private MetricSpecPackageImpl() {
        super(eNS_URI, MetricSpecFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others
     * upon which it depends.
     *
     * <p>
     * This method is used to initialize {@link MetricSpecPackage#eINSTANCE} when that field is
     * accessed. Clients should not invoke it directly. Instead, they should simply access that
     * field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static MetricSpecPackage init() {
        if (isInited) {
            return (MetricSpecPackage) EPackage.Registry.INSTANCE.getEPackage(MetricSpecPackage.eNS_URI);
        }

        // Obtain or create and register package
        final MetricSpecPackageImpl theMetricSpecPackage = (MetricSpecPackageImpl) (EPackage.Registry.INSTANCE
                .get(eNS_URI) instanceof MetricSpecPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
                        : new MetricSpecPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        IdentifierPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theMetricSpecPackage.createPackageContents();

        // Initialize created meta-data
        theMetricSpecPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theMetricSpecPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(MetricSpecPackage.eNS_URI, theMetricSpecPackage);
        return theMetricSpecPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getIdentifier() {
        return this.identifierEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getIdentifier_Literal() {
        return (EAttribute) this.identifierEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getIdentifier_TextualBaseMetricDescription() {
        return (EReference) this.identifierEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getTextualBaseMetricDescription() {
        return this.textualBaseMetricDescriptionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getTextualBaseMetricDescription_Identifiers() {
        return (EReference) this.textualBaseMetricDescriptionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getBaseMetricDescription() {
        return this.baseMetricDescriptionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getBaseMetricDescription_CaptureType() {
        return (EAttribute) this.baseMetricDescriptionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getBaseMetricDescription_DataType() {
        return (EAttribute) this.baseMetricDescriptionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getBaseMetricDescription_Scale() {
        return (EAttribute) this.baseMetricDescriptionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getBaseMetricDescription_ScopeOfValidity() {
        return (EAttribute) this.baseMetricDescriptionEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getMetricDescription() {
        return this.metricDescriptionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getMetricDescription_Repository() {
        return (EReference) this.metricDescriptionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getDescription() {
        return this.descriptionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getDescription_Name() {
        return (EAttribute) this.descriptionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getDescription_TextualDescription() {
        return (EAttribute) this.descriptionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getAggregationFunctionDescription() {
        return this.aggregationFunctionDescriptionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getMetricSetDescription() {
        return this.metricSetDescriptionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getMetricSetDescription_SubsumedMetrics() {
        return (EReference) this.metricSetDescriptionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getNumericalBaseMetricDescription() {
        return this.numericalBaseMetricDescriptionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getNumericalBaseMetricDescription_DefaultUnit() {
        return (EAttribute) this.numericalBaseMetricDescriptionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getNumericalBaseMetricDescription_PersistenceKind() {
        return (EAttribute) this.numericalBaseMetricDescriptionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getIJSQuantity() {
        return this.ijsQuantityEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getMetricDescriptionRepository() {
        return this.metricDescriptionRepositoryEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getMetricDescriptionRepository_MetricDescriptions() {
        return (EReference) this.metricDescriptionRepositoryEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EEnum getCaptureType() {
        return this.captureTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EEnum getScale() {
        return this.scaleEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EEnum getPersistenceKindOptions() {
        return this.persistenceKindOptionsEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EEnum getDataType() {
        return this.dataTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EEnum getScopeOfValidity() {
        return this.scopeOfValidityEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EDataType getEJSUnit() {
        return this.ejsUnitEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public MetricSpecFactory getMetricSpecFactory() {
        return (MetricSpecFactory) this.getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package. This method is guarded to have no affect on
     * any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public void createPackageContents() {
        if (this.isCreated) {
            return;
        }
        this.isCreated = true;

        // Create classes and their features
        this.identifierEClass = this.createEClass(IDENTIFIER);
        this.createEAttribute(this.identifierEClass, IDENTIFIER__LITERAL);
        this.createEReference(this.identifierEClass, IDENTIFIER__TEXTUAL_BASE_METRIC_DESCRIPTION);

        this.textualBaseMetricDescriptionEClass = this.createEClass(TEXTUAL_BASE_METRIC_DESCRIPTION);
        this.createEReference(this.textualBaseMetricDescriptionEClass, TEXTUAL_BASE_METRIC_DESCRIPTION__IDENTIFIERS);

        this.baseMetricDescriptionEClass = this.createEClass(BASE_METRIC_DESCRIPTION);
        this.createEAttribute(this.baseMetricDescriptionEClass, BASE_METRIC_DESCRIPTION__CAPTURE_TYPE);
        this.createEAttribute(this.baseMetricDescriptionEClass, BASE_METRIC_DESCRIPTION__DATA_TYPE);
        this.createEAttribute(this.baseMetricDescriptionEClass, BASE_METRIC_DESCRIPTION__SCALE);
        this.createEAttribute(this.baseMetricDescriptionEClass, BASE_METRIC_DESCRIPTION__SCOPE_OF_VALIDITY);

        this.metricDescriptionEClass = this.createEClass(METRIC_DESCRIPTION);
        this.createEReference(this.metricDescriptionEClass, METRIC_DESCRIPTION__REPOSITORY);

        this.descriptionEClass = this.createEClass(DESCRIPTION);
        this.createEAttribute(this.descriptionEClass, DESCRIPTION__NAME);
        this.createEAttribute(this.descriptionEClass, DESCRIPTION__TEXTUAL_DESCRIPTION);

        this.aggregationFunctionDescriptionEClass = this.createEClass(AGGREGATION_FUNCTION_DESCRIPTION);

        this.metricSetDescriptionEClass = this.createEClass(METRIC_SET_DESCRIPTION);
        this.createEReference(this.metricSetDescriptionEClass, METRIC_SET_DESCRIPTION__SUBSUMED_METRICS);

        this.numericalBaseMetricDescriptionEClass = this.createEClass(NUMERICAL_BASE_METRIC_DESCRIPTION);
        this.createEAttribute(this.numericalBaseMetricDescriptionEClass,
                NUMERICAL_BASE_METRIC_DESCRIPTION__DEFAULT_UNIT);
        this.createEAttribute(this.numericalBaseMetricDescriptionEClass,
                NUMERICAL_BASE_METRIC_DESCRIPTION__PERSISTENCE_KIND);

        this.ijsQuantityEClass = this.createEClass(IJS_QUANTITY);

        this.metricDescriptionRepositoryEClass = this.createEClass(METRIC_DESCRIPTION_REPOSITORY);
        this.createEReference(this.metricDescriptionRepositoryEClass,
                METRIC_DESCRIPTION_REPOSITORY__METRIC_DESCRIPTIONS);

        // Create enums
        this.captureTypeEEnum = this.createEEnum(CAPTURE_TYPE);
        this.scaleEEnum = this.createEEnum(SCALE);
        this.persistenceKindOptionsEEnum = this.createEEnum(PERSISTENCE_KIND_OPTIONS);
        this.dataTypeEEnum = this.createEEnum(DATA_TYPE);
        this.scopeOfValidityEEnum = this.createEEnum(SCOPE_OF_VALIDITY);

        // Create data types
        this.ejsUnitEDataType = this.createEDataType(EJS_UNIT);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model. This method is guarded to have
     * no affect on any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public void initializePackageContents() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;

        // Initialize package
        this.setName(eNAME);
        this.setNsPrefix(eNS_PREFIX);
        this.setNsURI(eNS_URI);

        // Obtain other dependent packages
        final IdentifierPackage theIdentifierPackage = (IdentifierPackage) EPackage.Registry.INSTANCE
                .getEPackage(IdentifierPackage.eNS_URI);

        // Create type parameters
        final ETypeParameter ejsUnitEDataType_Q = this.addETypeParameter(this.ejsUnitEDataType, "Q");

        // Set bounds for type parameters
        EGenericType g1 = this.createEGenericType(this.getIJSQuantity());
        ejsUnitEDataType_Q.getEBounds().add(g1);

        // Add supertypes to classes
        this.identifierEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
        this.textualBaseMetricDescriptionEClass.getESuperTypes().add(this.getBaseMetricDescription());
        this.baseMetricDescriptionEClass.getESuperTypes().add(this.getMetricDescription());
        this.metricDescriptionEClass.getESuperTypes().add(this.getDescription());
        this.descriptionEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
        this.aggregationFunctionDescriptionEClass.getESuperTypes().add(this.getDescription());
        this.metricSetDescriptionEClass.getESuperTypes().add(this.getMetricDescription());
        this.numericalBaseMetricDescriptionEClass.getESuperTypes().add(this.getBaseMetricDescription());
        this.metricDescriptionRepositoryEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());

        // Initialize classes and features; add operations and parameters
        this.initEClass(this.identifierEClass, Identifier.class, "Identifier", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getIdentifier_Literal(), this.ecorePackage.getEString(), "literal", null, 1, 1,
                Identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getIdentifier_TextualBaseMetricDescription(), this.getTextualBaseMetricDescription(),
                this.getTextualBaseMetricDescription_Identifiers(), "textualBaseMetricDescription", null, 1, 1,
                Identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.textualBaseMetricDescriptionEClass, TextualBaseMetricDescription.class,
                "TextualBaseMetricDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getTextualBaseMetricDescription_Identifiers(), this.getIdentifier(),
                this.getIdentifier_TextualBaseMetricDescription(), "identifiers", null, 1, -1,
                TextualBaseMetricDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.baseMetricDescriptionEClass, BaseMetricDescription.class, "BaseMetricDescription",
                IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getBaseMetricDescription_CaptureType(), this.getCaptureType(), "captureType", null, 1,
                1, BaseMetricDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getBaseMetricDescription_DataType(), this.getDataType(), "dataType", null, 1, 1,
                BaseMetricDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getBaseMetricDescription_Scale(), this.getScale(), "scale", null, 1, 1,
                BaseMetricDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getBaseMetricDescription_ScopeOfValidity(), this.getScopeOfValidity(),
                "scopeOfValidity", null, 1, 1, BaseMetricDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.metricDescriptionEClass, MetricDescription.class, "MetricDescription", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getMetricDescription_Repository(), this.getMetricDescriptionRepository(),
                this.getMetricDescriptionRepository_MetricDescriptions(), "repository", null, 1, 1,
                MetricDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.descriptionEClass, Description.class, "Description", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getDescription_Name(), this.ecorePackage.getEString(), "name", null, 1, 1,
                Description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getDescription_TextualDescription(), this.ecorePackage.getEString(),
                "textualDescription", null, 1, 1, Description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.aggregationFunctionDescriptionEClass, AggregationFunctionDescription.class,
                "AggregationFunctionDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.metricSetDescriptionEClass, MetricSetDescription.class, "MetricSetDescription",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getMetricSetDescription_SubsumedMetrics(), this.getMetricDescription(), null,
                "subsumedMetrics", null, 1, -1, MetricSetDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.numericalBaseMetricDescriptionEClass, NumericalBaseMetricDescription.class,
                "NumericalBaseMetricDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        g1 = this.createEGenericType(this.getEJSUnit());
        final EGenericType g2 = this.createEGenericType(this.getIJSQuantity());
        g1.getETypeArguments().add(g2);
        this.initEAttribute(this.getNumericalBaseMetricDescription_DefaultUnit(), g1, "defaultUnit", null, 0, 1,
                NumericalBaseMetricDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
                !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getNumericalBaseMetricDescription_PersistenceKind(), this.getPersistenceKindOptions(),
                "persistenceKind", null, 1, 1, NumericalBaseMetricDescription.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.ijsQuantityEClass, Quantity.class, "IJSQuantity", IS_ABSTRACT, IS_INTERFACE,
                !IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.metricDescriptionRepositoryEClass, MetricDescriptionRepository.class,
                "MetricDescriptionRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getMetricDescriptionRepository_MetricDescriptions(), this.getMetricDescription(),
                this.getMetricDescription_Repository(), "metricDescriptions", null, 0, -1,
                MetricDescriptionRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        this.initEEnum(this.captureTypeEEnum, CaptureType.class, "CaptureType");
        this.addEEnumLiteral(this.captureTypeEEnum, CaptureType.IDENTIFIER);
        this.addEEnumLiteral(this.captureTypeEEnum, CaptureType.INTEGER_NUMBER);
        this.addEEnumLiteral(this.captureTypeEEnum, CaptureType.REAL_NUMBER);

        this.initEEnum(this.scaleEEnum, Scale.class, "Scale");
        this.addEEnumLiteral(this.scaleEEnum, Scale.NOMINAL);
        this.addEEnumLiteral(this.scaleEEnum, Scale.ORDINAL);
        this.addEEnumLiteral(this.scaleEEnum, Scale.INTERVAL);
        this.addEEnumLiteral(this.scaleEEnum, Scale.RATIO);

        this.initEEnum(this.persistenceKindOptionsEEnum, PersistenceKindOptions.class, "PersistenceKindOptions");
        this.addEEnumLiteral(this.persistenceKindOptionsEEnum, PersistenceKindOptions.BINARY_PREFERRED);
        this.addEEnumLiteral(this.persistenceKindOptionsEEnum, PersistenceKindOptions.JS_XML_PREFERRED);

        this.initEEnum(this.dataTypeEEnum, DataType.class, "DataType");
        this.addEEnumLiteral(this.dataTypeEEnum, DataType.QUANTITATIVE);
        this.addEEnumLiteral(this.dataTypeEEnum, DataType.QUALITATIVE);

        this.initEEnum(this.scopeOfValidityEEnum, ScopeOfValidity.class, "ScopeOfValidity");
        this.addEEnumLiteral(this.scopeOfValidityEEnum, ScopeOfValidity.DISCRETE);
        this.addEEnumLiteral(this.scopeOfValidityEEnum, ScopeOfValidity.CONTINUOUS);

        // Initialize data types
        this.initEDataType(this.ejsUnitEDataType, Unit.class, "EJSUnit", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        this.createResource(eNS_URI);
    }

} // MetricSpecPackageImpl
