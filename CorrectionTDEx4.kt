
open class Compte(val numero:Int,val owner:String,var solde:Double)
{
    open fun debiter(montant:Double)
    {
        this.solde-=montant
    }
    fun crediter(montant:Double)
    {
        this.solde+=montant

    }

}
class compteEpargne(numero:Int,owner:String,solde:Double):Compte(numero,owner,solde)
{

    override fun debiter(montant: Double) {
        if(this.solde-montant>=0)
        this.solde-=montant

    }

    fun crediter_pourcentage()
    {
        this.solde+=this.solde/1000
    }
}
class compteCourant(numero:Int,owner:String,solde:Double):Compte(numero,owner,solde)
{
    override fun debiter(montant: Double) {
        if(this.solde-montant>=-1000)
            this.solde-=montant

    }

}


fun main()
{


}