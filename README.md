
# Spring Security - JWT Authentication 

Spring Security est un framework robuste qui permet de préconfigurer et de personnaliser des fonctions de sécurité au sein d'une application Java ( en particulier celle basée sur le framework Spring). 

**Support de l'authentification :**

* Gère l'identité des utilisateurs.
* Peut utiliser différentes sources comme une base de données, un service LDAP, ou un fournisseur externe (OAuth2, OpenID Connect, etc.)

**Autorisation :**

* Contrôle l'accès aux ressources.
* Permet de définir des règles au niveau des URLs, des méthodes ou des couches métier.

**Extensibilité :**

* Peut être personnalisé pour intégrer de nouveaux mécanismes de sécurité ou répondre à des besoins spécifiques.

**Sécurité par filtres :**

* Implémentation d'une chaîne de filtres pour gérer les requêtes HTTP.

**Intégration avec OAuth2 et JWT :**

* Fournit des fonctionnalités pour les systèmes d'authentification modernes tels que l'utilisation de tokens JWT ou les systèmes OAuth2.

### Concepts clés de Spring Security :

#### Authentication (Authentification) :

Vérifie l'identité d'un utilisateur.
Stockée dans un objet Authentication et gérée via le SecurityContext.

#### Authorization (Autorisation) :

Décide si un utilisateur authentifié a le droit d'accéder à une ressource ou d'exécuter une action.
Utilise des rôles (ROLE_ADMIN, ROLE_USER) ou des permissions.

#### SecurityContext :

Contient les informations sur l'utilisateur authentifié.
Accessible globalement dans l'application via le SecurityContextHolder.

#### Filter Chain (Chaîne de filtres) :

Série de filtres configurés pour gérer les requêtes entrantes et appliquant les règles de sécurité.

#### RoleHierarchy :

Définit la hiérarchie entre les rôles (exemple : ROLE_ADMIN > ROLE_USER).

### Architecture :

#### 1 . Chaîne de filtres de sécurité :
Chaque requête HTTP passe par une série de filtres configurés dans Spring Security. Les filtres jouent un rôle essentiel dans l'application des règles de sécurité.

**Filtres communs :**
* UsernamePasswordAuthenticationFilter : Gère l'authentification avec nom d'utilisateur/mot de passe.
* BasicAuthenticationFilter : Gère l'authentification via HTTP Basic.
* JwtAuthenticationFilter : Gère l'authentification basée sur les tokens JWT.
* FilterSecurityInterceptor : Applique les règles d'accès.


#### 2. AuthenticationManager :




