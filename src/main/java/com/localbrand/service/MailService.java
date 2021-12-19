package com.localbrand.service;

import com.localbrand.dto.MailMessageDTO;
import com.localbrand.dto.response.statistical.SummaryStatusBillDTO;
import com.localbrand.dto.response.statistical.SummaryStatusBillDTO2;
import com.localbrand.entity.User;
import com.localbrand.entity.Voucher;

import javax.mail.MessagingException;
import java.io.IOException;
import java.util.List;

public interface MailService {

    String sendEmailForgotPassword(User user);

    String sendEmailBillSuccess(User user, Voucher voucher);

    String sendEmail(MailMessageDTO mailMessageDTO) throws MessagingException, IOException;

    String sendEmailBillByDate(List<SummaryStatusBillDTO2> list11);
}
