 
 
			 
			
			 <aside id="left-panel" class="left-panel">
        <nav class="navbar navbar-expand-sm navbar-default">

            <div id="main-menu" class="main-menu collapse navbar-collapse">
                <ul class="nav navbar-nav"> 
                <c:forEach items="${menuList}" var="menu1">
                    <li class="menu-item-has-children dropdown " id="lm${menu1.id }">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" > 
                        <i class="${menu1.icon == null ? 'menu-icon fa fa-leaf black' : menu1.icon}"></i>	${menu1.name }</a>
                        	<c:if test="${'[]' != menu1.subMenu}">
                        <ul class="sub-menu children dropdown-menu"> 
                        	<c:forEach items="${menu1.subMenu}" var="menu2">                          
                         <li><i class="${menu2.icon == null ? 'menu-icon fa fa-leaf black' : menu2.icon}"></i>
                         <a href="${menu2.url}" target ="content" >${menu2.name }</a>
                         </li>
                       
                          </c:forEach> 
                        </ul>
                        	</c:if>
                    </li>
             </c:forEach> 
                </ul>
            </div><!-- /.navbar-collapse -->
        </nav>
    </aside><!-- /#left-panel -->