import com.vovsolutions.goodcode.auth.Role
import com.vovsolutions.goodcode.auth.User
import com.vovsolutions.goodcode.auth.UserRole

class BootStrap {

    def init = { servletContext ->

    	def adminRole = Role.findOrSaveByAuthority('ROLE_ADMIN')
  		if (!User.count()) {
			def admin = new User(username: 'admin', password: '123456').save()
     		UserRole.create admin, adminRole, true
  		}
    }

    def destroy = {
    
    }
}
