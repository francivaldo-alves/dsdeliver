import "./styles.css";
import {ReactComponent as InstagramIcon} from "./instagram.svg"
import {ReactComponent as LinkedinIcon} from "./linkedin.svg"
function Footer() {
  return (
    <footer className="main-footer">
      App DS Delivery desenvolvido Por Francivaldo Alves.
      <div className="footer-icons">
        <a href="https://www.linkedin.com/in/francivaldo-alves-155510182/"target="_new" >
        <LinkedinIcon/>
        </a>
        <a href="https://www.instagram.com/francivaldo.sza"target="_new" >
        
          <InstagramIcon/>
        </a>
      </div>
    </footer>
  );
}

export default Footer;
