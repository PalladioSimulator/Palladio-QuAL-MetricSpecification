/**
 */
package org.palladiosimulator.metricspec.util;

import javax.measure.quantity.Quantity;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
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
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.metricspec.MetricSpecPackage
 * @generated
 */
public class MetricSpecSwitch<T> extends Switch<T> {

    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static MetricSpecPackage modelPackage;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public MetricSpecSwitch() {
        if (modelPackage == null) {
            modelPackage = MetricSpecPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(final EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result;
     * it yields that result. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(final int classifierID, final EObject theEObject) {
        switch (classifierID) {
        case MetricSpecPackage.IDENTIFIER: {
            final Identifier identifier = (Identifier) theEObject;
            T result = this.caseIdentifier(identifier);
            if (result == null) {
                result = this.caseIdentifier_Identifier(identifier);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case MetricSpecPackage.TEXTUAL_BASE_METRIC_DESCRIPTION: {
            final TextualBaseMetricDescription textualBaseMetricDescription = (TextualBaseMetricDescription) theEObject;
            T result = this.caseTextualBaseMetricDescription(textualBaseMetricDescription);
            if (result == null) {
                result = this.caseBaseMetricDescription(textualBaseMetricDescription);
            }
            if (result == null) {
                result = this.caseMetricDescription(textualBaseMetricDescription);
            }
            if (result == null) {
                result = this.caseDescription(textualBaseMetricDescription);
            }
            if (result == null) {
                result = this.caseIdentifier_Identifier(textualBaseMetricDescription);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case MetricSpecPackage.BASE_METRIC_DESCRIPTION: {
            final BaseMetricDescription baseMetricDescription = (BaseMetricDescription) theEObject;
            T result = this.caseBaseMetricDescription(baseMetricDescription);
            if (result == null) {
                result = this.caseMetricDescription(baseMetricDescription);
            }
            if (result == null) {
                result = this.caseDescription(baseMetricDescription);
            }
            if (result == null) {
                result = this.caseIdentifier_Identifier(baseMetricDescription);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case MetricSpecPackage.METRIC_DESCRIPTION: {
            final MetricDescription metricDescription = (MetricDescription) theEObject;
            T result = this.caseMetricDescription(metricDescription);
            if (result == null) {
                result = this.caseDescription(metricDescription);
            }
            if (result == null) {
                result = this.caseIdentifier_Identifier(metricDescription);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case MetricSpecPackage.DESCRIPTION: {
            final Description description = (Description) theEObject;
            T result = this.caseDescription(description);
            if (result == null) {
                result = this.caseIdentifier_Identifier(description);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case MetricSpecPackage.AGGREGATION_FUNCTION_DESCRIPTION: {
            final AggregationFunctionDescription aggregationFunctionDescription = (AggregationFunctionDescription) theEObject;
            T result = this.caseAggregationFunctionDescription(aggregationFunctionDescription);
            if (result == null) {
                result = this.caseDescription(aggregationFunctionDescription);
            }
            if (result == null) {
                result = this.caseIdentifier_Identifier(aggregationFunctionDescription);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case MetricSpecPackage.METRIC_SET_DESCRIPTION: {
            final MetricSetDescription metricSetDescription = (MetricSetDescription) theEObject;
            T result = this.caseMetricSetDescription(metricSetDescription);
            if (result == null) {
                result = this.caseMetricDescription(metricSetDescription);
            }
            if (result == null) {
                result = this.caseDescription(metricSetDescription);
            }
            if (result == null) {
                result = this.caseIdentifier_Identifier(metricSetDescription);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case MetricSpecPackage.NUMERICAL_BASE_METRIC_DESCRIPTION: {
            final NumericalBaseMetricDescription numericalBaseMetricDescription = (NumericalBaseMetricDescription) theEObject;
            T result = this.caseNumericalBaseMetricDescription(numericalBaseMetricDescription);
            if (result == null) {
                result = this.caseBaseMetricDescription(numericalBaseMetricDescription);
            }
            if (result == null) {
                result = this.caseMetricDescription(numericalBaseMetricDescription);
            }
            if (result == null) {
                result = this.caseDescription(numericalBaseMetricDescription);
            }
            if (result == null) {
                result = this.caseIdentifier_Identifier(numericalBaseMetricDescription);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case MetricSpecPackage.IJS_QUANTITY: {
            final Quantity ijsQuantity = (Quantity) theEObject;
            T result = this.caseIJSQuantity(ijsQuantity);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case MetricSpecPackage.METRIC_DESCRIPTION_REPOSITORY: {
            final MetricDescriptionRepository metricDescriptionRepository = (MetricDescriptionRepository) theEObject;
            T result = this.caseMetricDescriptionRepository(metricDescriptionRepository);
            if (result == null) {
                result = this.caseIdentifier_Identifier(metricDescriptionRepository);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        default:
            return this.defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentifier(final Identifier object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Textual Base Metric Description</em>'. <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Textual Base Metric Description</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTextualBaseMetricDescription(final TextualBaseMetricDescription object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Base Metric Description</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Base Metric Description</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBaseMetricDescription(final BaseMetricDescription object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Metric Description</em>
     * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Metric Description</em>
     *         '.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMetricDescription(final MetricDescription object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Description</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Description</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDescription(final Description object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Aggregation Function Description</em>'. <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Aggregation Function Description</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAggregationFunctionDescription(final AggregationFunctionDescription object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Metric Set Description</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Metric Set Description</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMetricSetDescription(final MetricSetDescription object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Numerical Base Metric Description</em>'. <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Numerical Base Metric Description</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNumericalBaseMetricDescription(final NumericalBaseMetricDescription object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>IJS Quantity</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>IJS Quantity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIJSQuantity(final Quantity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Metric Description Repository</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Metric Description Repository</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMetricDescriptionRepository(final MetricDescriptionRepository object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentifier_Identifier(final de.uka.ipd.sdq.identifier.Identifier object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch, but this is the last case anyway. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(final EObject object) {
        return null;
    }

} // MetricSpecSwitch
