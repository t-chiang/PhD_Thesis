/**
 * generated by Xtext 2.32.0
 */
package org.xtext.mcmaster.requirements.gherkin.rgh.rgh;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Precondition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.mcmaster.requirements.gherkin.rgh.rgh.Precondition#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.mcmaster.requirements.gherkin.rgh.rgh.Precondition#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.xtext.mcmaster.requirements.gherkin.rgh.rgh.RghPackage#getPrecondition()
 * @model
 * @generated
 */
public interface Precondition extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.mcmaster.requirements.gherkin.rgh.rgh.RghPackage#getPrecondition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.mcmaster.requirements.gherkin.rgh.rgh.Precondition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' containment reference.
   * @see #setDescription(Description)
   * @see org.xtext.mcmaster.requirements.gherkin.rgh.rgh.RghPackage#getPrecondition_Description()
   * @model containment="true"
   * @generated
   */
  Description getDescription();

  /**
   * Sets the value of the '{@link org.xtext.mcmaster.requirements.gherkin.rgh.rgh.Precondition#getDescription <em>Description</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' containment reference.
   * @see #getDescription()
   * @generated
   */
  void setDescription(Description value);

} // Precondition
