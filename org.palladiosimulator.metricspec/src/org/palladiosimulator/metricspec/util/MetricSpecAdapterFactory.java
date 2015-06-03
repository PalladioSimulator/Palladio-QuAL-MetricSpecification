/**
 */
package org.palladiosimulator.metricspec.util;

import javax.measure.quantity.Quantity;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.mdsdprofiles.StereotypableElement;
import org.palladiosimulator.metricspec.AggregationFunctionDescription;
import org.palladiosimulator.metricspec.BaseMetricDescription;
import org.palladiosimulator.metricspec.Description;
import org.palladiosimulator.metricspec.Identifier;
import org.palladiosimulator.metricspec.MetricDescription;
import org.palladiosimulator.metricspec.MetricDescriptionRepository;
import org.palladiosimulator.metricspec.MetricSetDescription;
import org.palladiosimulator.metricspec.MetricSpecPackage;
import org.palladiosimulator.metricspec.NumericalBaseMetricDescription;
import org.palladiosimulator.metricspec.TextualBaseMetricDescription;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.metricspec.MetricSpecPackage
 * @generated
 */
public class MetricSpecAdapterFactory extends AdapterFactoryImpl {

    /**
     * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static MetricSpecPackage modelPackage;

    /**
     * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public MetricSpecAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = MetricSpecPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object. <!-- begin-user-doc
     * --> This implementation returns <code>true</code> if the object is either the model's package
     * or is an instance object of the model. <!-- end-user-doc -->
     *
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(final Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected MetricSpecSwitch<Adapter> modelSwitch = new MetricSpecSwitch<Adapter>() {

        @Override
        public Adapter caseIdentifier(final Identifier object) {
            return MetricSpecAdapterFactory.this.createIdentifierAdapter();
        }

        @Override
        public Adapter caseTextualBaseMetricDescription(final TextualBaseMetricDescription object) {
            return MetricSpecAdapterFactory.this.createTextualBaseMetricDescriptionAdapter();
        }

        @Override
        public Adapter caseBaseMetricDescription(final BaseMetricDescription object) {
            return MetricSpecAdapterFactory.this.createBaseMetricDescriptionAdapter();
        }

        @Override
        public Adapter caseMetricDescription(final MetricDescription object) {
            return MetricSpecAdapterFactory.this.createMetricDescriptionAdapter();
        }

        @Override
        public Adapter caseDescription(final Description object) {
            return MetricSpecAdapterFactory.this.createDescriptionAdapter();
        }

        @Override
        public Adapter caseAggregationFunctionDescription(final AggregationFunctionDescription object) {
            return MetricSpecAdapterFactory.this.createAggregationFunctionDescriptionAdapter();
        }

        @Override
        public Adapter caseMetricSetDescription(final MetricSetDescription object) {
            return MetricSpecAdapterFactory.this.createMetricSetDescriptionAdapter();
        }

        @Override
        public Adapter caseNumericalBaseMetricDescription(final NumericalBaseMetricDescription object) {
            return MetricSpecAdapterFactory.this.createNumericalBaseMetricDescriptionAdapter();
        }

        @Override
        public Adapter caseIJSQuantity(final Quantity object) {
            return MetricSpecAdapterFactory.this.createIJSQuantityAdapter();
        }

        @Override
        public Adapter caseMetricDescriptionRepository(final MetricDescriptionRepository object) {
            return MetricSpecAdapterFactory.this.createMetricDescriptionRepositoryAdapter();
        }

        @Override
        public Adapter caseStereotypableElement(final StereotypableElement object) {
            return MetricSpecAdapterFactory.this.createStereotypableElementAdapter();
        }

        @Override
        public Adapter caseIdentifier_Identifier(final de.uka.ipd.sdq.identifier.Identifier object) {
            return MetricSpecAdapterFactory.this.createIdentifier_IdentifierAdapter();
        }

        @Override
        public Adapter defaultCase(final EObject object) {
            return MetricSpecAdapterFactory.this.createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param target
     *            the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(final Notifier target) {
        return this.modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.metricspec.Identifier <em>Identifier</em>}'. <!-- begin-user-doc
     * --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.metricspec.Identifier
     * @generated
     */
    public Adapter createIdentifierAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.metricspec.TextualBaseMetricDescription
     * <em>Textual Base Metric Description</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.metricspec.TextualBaseMetricDescription
     * @generated
     */
    public Adapter createTextualBaseMetricDescriptionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.metricspec.BaseMetricDescription
     * <em>Base Metric Description</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.metricspec.BaseMetricDescription
     * @generated
     */
    public Adapter createBaseMetricDescriptionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.metricspec.MetricDescription <em>Metric Description</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.metricspec.MetricDescription
     * @generated
     */
    public Adapter createMetricDescriptionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.metricspec.Description <em>Description</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.metricspec.Description
     * @generated
     */
    public Adapter createDescriptionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.metricspec.AggregationFunctionDescription
     * <em>Aggregation Function Description</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.metricspec.AggregationFunctionDescription
     * @generated
     */
    public Adapter createAggregationFunctionDescriptionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.metricspec.MetricSetDescription <em>Metric Set Description</em>}
     * '. <!-- begin-user-doc --> This default implementation returns null so that we can easily
     * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.metricspec.MetricSetDescription
     * @generated
     */
    public Adapter createMetricSetDescriptionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.metricspec.NumericalBaseMetricDescription
     * <em>Numerical Base Metric Description</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.metricspec.NumericalBaseMetricDescription
     * @generated
     */
    public Adapter createNumericalBaseMetricDescriptionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link javax.measure.quantity.Quantity
     * <em>IJS Quantity</em>}'. <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
     * the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see javax.measure.quantity.Quantity
     * @generated
     */
    public Adapter createIJSQuantityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.metricspec.MetricDescriptionRepository
     * <em>Metric Description Repository</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.metricspec.MetricDescriptionRepository
     * @generated
     */
    public Adapter createMetricDescriptionRepositoryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.mdsdprofiles.StereotypableElement
     * <em>Stereotypable Element</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.mdsdprofiles.StereotypableElement
     * @generated
     */
    public Adapter createStereotypableElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.identifier.Identifier
     * <em>Identifier</em>}'. <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
     * the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see de.uka.ipd.sdq.identifier.Identifier
     * @generated
     */
    public Adapter createIdentifier_IdentifierAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case. <!-- begin-user-doc --> This default
     * implementation returns null. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} // MetricSpecAdapterFactory
