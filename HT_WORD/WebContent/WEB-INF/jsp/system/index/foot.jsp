  <div class="modal fade" id="scrollmodal" tabindex="-1" role="dialog" aria-labelledby="scrollmodalLabel" aria-hidden="true">
                <div class="modal-dialog modal-lg" role="document" >
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="scrollmodalLabel"></h5>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close"  style="
    position: absolute;
    top: 10px;
    right: 10px;
">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                        <div class="modal-body">
                      
                        </div>
                      
                    </div>
                </div>
            </div>

 
		
 <script src="assets/js/vendor/jquery-2.1.4.min.js"></script>
<script src="assets/js/popper.min.js"></script>
<script src="assets/js/bootstrap.min.js"></script>
<script src="assets/js/jquery.matchHeight.min.js"></script>
<script src="assets/js/main.js"></script>
<script src="assets/js/lib/chosen/chosen.jquery.min.js"></script>

 
<script>
var $=jQuery;
jQuery(function(){
	
     
	jQuery.window=function(option){
	 
		jQuery('#scrollmodalLabel').html(option.Title);
		jQuery('#scrollmodal .modal-body').load(option.URL);
		option.Width&&jQuery('#scrollmodal .modal-dialog').css("max-width",option.Width);
		
		jQuery('#scrollmodal').modal('show')
	}
})
</script>

<script src="assets/js/moment.js"></script>

<script src="assets/js/bootstrap-datepicker.js"></script>
