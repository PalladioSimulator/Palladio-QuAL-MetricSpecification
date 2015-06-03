/**
 */
package org.palladiosimulator.metricspec.impl;

import javax.measure.unit.Unit;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.metricspec.AggregationFunctionDescription;
import org.palladiosimulator.metricspec.CaptureType;
import org.palladiosimulator.metricspec.DataType;
import org.palladiosimulator.metricspec.Identifier;
import org.palladiosimulator.metricspec.MetricDescriptionRepository;
import org.palladiosimulator.metricspec.MetricSetDescription;
import org.palladiosimulator.metricspec.MetricSpecFactory;
import org.palladiosimulator.metricspec.MetricSpecPackage;
import org.palladiosimulator.metricspec.NumericalBaseMetricDescription;
import org.palladiosimulator.metricspec.PersistenceKindOptions;
import org.palladiosimulator.metricspec.Scale;
import org.palladiosimulator.metricspec.TextualBaseMetricDescription;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class MetricSpecFactoryImpl extends EFactoryImpl implements MetricSpecFactory {

    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static MetricSpecFactory init() {
        try {
            final MetricSpecFactory theMetricSpecFactory = (MetricSpecFactory) EPackage.Registry.INSTANCE
                    .getEFactory(MetricSpecPackage.eNS_URI);
            if (theMetricSpecFactory != null) {
                return theMetricSpecFactory;
            }
        } catch (final Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new MetricSpecFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public MetricSpecFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
        case MetricSpecPackage.IDENTIFIER:
            return this.createIdentifier();
        case MetricSpecPackage.TEXTUAL_BASE_METRIC_DESCRIPTION:
            return this.createTextualBaseMetricDescription();
        case MetricSpecPackage.AGGREGATION_FUNCTION_DESCRIPTION:
            return this.createAggregationFunctionDescription();
        case MetricSpecPackage.METRIC_SET_DESCRIPTION:
            return this.createMetricSetDescription();
        case MetricSpecPackage.NUMERICAL_BASE_METRIC_DESCRIPTION:
            return this.createNumericalBaseMetricDescription();
        case MetricSpecPackage.METRIC_DESCRIPTION_REPOSITORY:
            return this.createMetricDescriptionRepository();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object createFromString(final EDataType eDataType, final String initialValue) {
        switch (eDataType.getClassifierID()) {
        case MetricSpecPackage.CAPTURE_TYPE:
            return this.createCaptureTypeFromString(eDataType, initialValue);
        case MetricSpecPackage.SCALE:
            return this.createScaleFromString(eDataType, initialValue);
        case MetricSpecPackage.PERSISTENCE_KIND_OPTIONS:
            return this.createPersistenceKindOptionsFromString(eDataType, initialValue);
        case MetricSpecPackage.DATA_TYPE:
            return this.createDataTypeFromString(eDataType, initialValue);
        case MetricSpecPackage.EJS_UNIT:
            return this.createEJSUnitFromString(eDataType, initialValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String convertToString(final EDataType eDataType, final Object instanceValue) {
        switch (eDataType.getClassifierID()) {
        case MetricSpecPackage.CAPTURE_TYPE:
            return this.convertCaptureTypeToString(eDataType, instanceValue);
        case MetricSpecPackage.SCALE:
            return this.convertScaleToString(eDataType, instanceValue);
        case MetricSpecPackage.PERSISTENCE_KIND_OPTIONS:
            return this.convertPersistenceKindOptionsToString(eDataType, instanceValue);
        case MetricSpecPackage.DATA_TYPE:
            return this.convertDataTypeToString(eDataType, instanceValue);
        case MetricSpecPackage.EJS_UNIT:
            return this.convertEJSUnitToString(eDataType, instanceValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Identifier createIdentifier() {
        final IdentifierImpl identifier = new IdentifierImpl();
        return identifier;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public TextualBaseMetricDescription createTextualBaseMetricDescription() {
        final TextualBaseMetricDescriptionImpl textualBaseMetricDescription = new TextualBaseMetricDescriptionImpl();
        return textualBaseMetricDescription;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public AggregationFunctionDescription createAggregationFunctionDescription() {
        final AggregationFunctionDescriptionImpl aggregationFunctionDescription = new AggregationFunctionDescriptionImpl();
        return aggregationFunctionDescription;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public MetricSetDescription createMetricSetDescription() {
        final MetricSetDescriptionImpl metricSetDescription = new MetricSetDescriptionImpl();
        return metricSetDescription;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NumericalBaseMetricDescription createNumericalBaseMetricDescription() {
        final NumericalBaseMetricDescriptionImpl numericalBaseMetricDescription = new NumericalBaseMetricDescriptionImpl();
        return numericalBaseMetricDescription;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public MetricDescriptionRepository createMetricDescriptionRepository() {
        final MetricDescriptionRepositoryImpl metricDescriptionRepository = new MetricDescriptionRepositoryImpl();
        return metricDescriptionRepository;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public CaptureType createCaptureTypeFromString(final EDataType eDataType, final String initialValue) {
        final CaptureType result = CaptureType.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertCaptureTypeToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public Scale createScaleFromString(final EDataType eDataType, final String initialValue) {
        final Scale result = Scale.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertScaleToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public PersistenceKindOptions createPersistenceKindOptionsFromString(final EDataType eDataType,
            final String initialValue) {
        final PersistenceKindOptions result = PersistenceKindOptions.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertPersistenceKindOptionsToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public DataType createDataTypeFromString(final EDataType eDataType, final String initialValue) {
        final DataType result = DataType.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertDataTypeToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public Unit<?> createEJSUnitFromString(final EDataType eDataType, final String initialValue) {
        return (Unit<?>) super.createFromString(initialValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertEJSUnitToString(final EDataType eDataType, final Object instanceValue) {
        return super.convertToString(instanceValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public MetricSpecPackage getMetricSpecPackage() {
        return (MetricSpecPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @deprecated
     * @generated
     */
    @Deprecated
    public static MetricSpecPackage getPackage() {
        return MetricSpecPackage.eINSTANCE;
    }

} // MetricSpecFactoryImpl
