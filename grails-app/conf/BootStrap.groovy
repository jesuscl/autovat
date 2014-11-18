import com.autovat.Address
import com.autovat.Role
import com.autovat.User
import com.autovat.UserRole
import com.autovat.Worker
import cr.co.arquetipos.currencies.Money

class BootStrap {

    def init = { servletContext ->
        def userRole = Role.findByAuthority('ROLE_USER') ?: new Role(authority: 'ROLE_USER').save(failOnError: true)
        def adminRole = Role.findByAuthority('ROLE_ADMIN') ?: new Role(authority: 'ROLE_ADMIN').save(failOnError: true)

        def adminUser = User.findByUsername('admin') ?: new User(
                username: 'admin',
                password: 'admin').save(failOnError: true)

        if (!adminUser.authorities.contains(adminRole)) {
            UserRole.create adminUser, adminRole
        }

        def normalUser = User.findByUsername('jesus') ?: new User(
                username: 'jesus',
                password: 'jesus').save(failOnError: true)

        if (!normalUser.authorities.contains(userRole)) {
            UserRole.create(normalUser, userRole)
        }

        new Worker(
                user: normalUser,
                email: 'jesus.calvo@gmail.com',
                bankAccountNumber: 'ES0000940100120000068950',
                withholdingTaxRatio: 0,
                address: new Address(street: 'Rue Terre Neuve, 46', location: 'Bruxelles', country: 'BE', postalCode: '1000'),
                name: 'Jesus Calvo Lopez',
                vatId: 'BE 0547 586 873',
                dailyRates: new Money(amount: 382.0, currency: 'EUR')
        ).save(failOnError: true)



    }
    def destroy = {
    }
}
