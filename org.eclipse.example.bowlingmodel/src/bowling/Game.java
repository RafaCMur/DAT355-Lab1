/**
 */
package bowling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bowling.Game#getMachup <em>Machup</em>}</li>
 *   <li>{@link bowling.Game#getPlayer <em>Player</em>}</li>
 *   <li>{@link bowling.Game#getFrames <em>Frames</em>}</li>
 * </ul>
 *
 * @see bowling.BowlingPackage#getGame()
 * @model
 * @generated
 */
public interface Game extends EObject {
	/**
	 * Returns the value of the '<em><b>Machup</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link bowling.Machup#getGames <em>Games</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machup</em>' container reference.
	 * @see #setMachup(Machup)
	 * @see bowling.BowlingPackage#getGame_Machup()
	 * @see bowling.Machup#getGames
	 * @model opposite="games" transient="false"
	 * @generated
	 */
	Machup getMachup();

	/**
	 * Sets the value of the '{@link bowling.Game#getMachup <em>Machup</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Machup</em>' container reference.
	 * @see #getMachup()
	 * @generated
	 */
	void setMachup(Machup value);

	/**
	 * Returns the value of the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player</em>' reference.
	 * @see #setPlayer(Player)
	 * @see bowling.BowlingPackage#getGame_Player()
	 * @model
	 * @generated
	 */
	Player getPlayer();

	/**
	 * Sets the value of the '{@link bowling.Game#getPlayer <em>Player</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player</em>' reference.
	 * @see #getPlayer()
	 * @generated
	 */
	void setPlayer(Player value);

	/**
	 * Returns the value of the '<em><b>Frames</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frames</em>' attribute list.
	 * @see bowling.BowlingPackage#getGame_Frames()
	 * @model upper="10"
	 * @generated
	 */
	EList<Integer> getFrames();

} // Game
